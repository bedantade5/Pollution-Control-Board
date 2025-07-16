package com.vig.polutioncontrol.restapi.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vig.polutioncontrol.common.login.dto.GetReportResp;
import com.vig.polutioncontrol.common.login.model.GetDetailsResp;
import com.vig.polutioncontrol.common.login.model.LoginDetails;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.common.model.APIResponse;
import com.vig.polutioncontrol.common.util.CONSTANTS;
import com.vig.polutioncontrol.restapi.service.LoginService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("rs/v1/master")
@Tag(name = "Login endpoints")
public class LoginRestController {

	@Autowired
	private LoginService loginservice;

	private Logger logger = LoggerFactory.getLogger(LoginRestController.class);

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/user_authentication")
	@Operation(summary = "User Login validate endpoint")
	public ResponseEntity<APIResponse> loginAuthentication(@RequestBody LoginDetails entity) {
		APIResponse response = new APIResponse();
		HttpStatus httpStatus = HttpStatus.OK;

		try {
			if (entity == null || entity.getUser_name() == null || entity.getUser_name().trim().isEmpty()
					|| entity.getPassword() == null || entity.getPassword().trim().isEmpty()) {
				response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
				response.setMessage(CONSTANTS.MSG_PARAM_INVALID);
				return new ResponseEntity<>(response, httpStatus);
			}

			LoginResponse loginResponse = loginservice.LoginAuthentication(entity);

			if (loginResponse != null) {
				response.setData(loginResponse);
				response.setStatus(CONSTANTS.API_STATUS_SUCCESS);
				response.setMessage(CONSTANTS.MSG_LOGIN_SUCCESSFULLY);
			} else {
				response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
				response.setMessage(CONSTANTS.MSG_LOGIN_FAILURE);
			}

		} catch (Exception ex) {
			logger.error("Exception during login: ", ex);
			response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
			response.setMessage(CONSTANTS.MSG_EXCEPTION_ERROR);
		}

		return new ResponseEntity<>(response, httpStatus);
	}

	@CrossOrigin(origins = "", allowedHeaders = "")
	@PostMapping("/getDetails")
	@Operation(summary = "Get Survey Information endpoint")
	public ResponseEntity<APIResponse> getDetails(@RequestParam String dt) {
		ResponseEntity<APIResponse> responseEntity = null;
		APIResponse response = new APIResponse();
		HttpStatus httpStatus = HttpStatus.OK;
		List<GetDetailsResp> lstDetails = null;

		try {
			do {
				if (null == dt) {
					response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
					response.setMessage(CONSTANTS.MSG_PARAM_INVALID);
					break;
				}

				else {
					lstDetails = loginservice.getDetails(dt);

					if (null == lstDetails) {
						response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
						response.setMessage(CONSTANTS.MSG_HOUSE_SURVEY_INFO_GET_FAILURE);
					} else {
						response.setData(lstDetails);
						response.setStatus(CONSTANTS.API_STATUS_SUCCESS);
						response.setMessage(CONSTANTS.MSG_HOUSE_SURVEY_INFO_GET_SUCCESS);
					}
				}
			} while (false);
		} catch (Exception ex) {
			ex.printStackTrace();
			response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
			response.setMessage(CONSTANTS.MSG_EXCEPTION_ERROR);
		}
		responseEntity = new ResponseEntity<>(response, httpStatus);

		return responseEntity;
	}

	@CrossOrigin(origins = "", allowedHeaders = "")
	@PostMapping("/getEnvironmentalReport")
	@Operation(summary = "Get Environmental Report Information endpoint")
	public ResponseEntity<APIResponse> getEnvironmentalReport(@RequestParam String startDateTime,
			@RequestParam String endDateTime) {

		ResponseEntity<APIResponse> responseEntity = null;
		APIResponse response = new APIResponse();
		HttpStatus httpStatus = HttpStatus.OK;
		List<GetReportResp> reportList = null;

		try {
			do {
				if (startDateTime == null || endDateTime == null || startDateTime.isEmpty() || endDateTime.isEmpty()) {
					response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
					response.setMessage(CONSTANTS.MSG_PARAM_INVALID);
					break;
				}

				reportList = loginservice.getEnvironmentalReport(startDateTime, endDateTime);

				if (reportList == null || reportList.isEmpty()) {
					response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
					response.setMessage(CONSTANTS.MSG_REPORT_INFO_GET_FAILURE);
				} else {
					response.setData(reportList);
					response.setStatus(CONSTANTS.API_STATUS_SUCCESS);
					response.setMessage(CONSTANTS.MSG_REPORT_INFO_GET_SUCCESS);
				}

			} while (false);

		} catch (Exception ex) {
			ex.printStackTrace();
			response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
			response.setMessage(CONSTANTS.MSG_EXCEPTION_ERROR);
		}

		responseEntity = new ResponseEntity<>(response, httpStatus);
		return responseEntity;
	}

}
