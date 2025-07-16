package com.vig.polutioncontrol.restapi.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import com.vig.polutioncontrol.common.jwt.model.AccessTokenDetails;
import com.vig.polutioncontrol.common.login.model.SaveUserAuth;
import com.vig.polutioncontrol.common.model.APIResponse;
import com.vig.polutioncontrol.common.util.CONSTANTS;
import com.vig.polutioncontrol.restapi.service.JwtAutheticationService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("user/auth")
@Tag(name = "Authentication endpoints")

public class JwtAutheticationRestController {

	@Autowired
	private JwtAutheticationService jwtAuthenticationService;

	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@PostMapping("/generateToken")
	@Operation(summary = "Token Generation Endpoint")
	public ResponseEntity<APIResponse> token(Authentication authentication) {
		APIResponse response = new APIResponse();
		HttpStatus httpStatus = HttpStatus.OK;

		try {
			AccessTokenDetails tokenDetails = jwtAuthenticationService.generateToken(authentication);

			if (tokenDetails != null) {
				response.setStatus(CONSTANTS.API_STATUS_SUCCESS);
				response.setMessage(CONSTANTS.MSG_TOKEN_GENERATION_SUCCESS);
				response.setData(tokenDetails);
			} else {
				response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
				response.setMessage(CONSTANTS.MSG_TOKEN_GENERATION_FAILURE);
			}
		} catch (Exception ex) {
			//logger.error("Exception during token generation: ", ex);
			ex.printStackTrace();
			response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
			response.setMessage(CONSTANTS.MSG_TOKEN_GENERATION_FAILURE);
		}

		return new ResponseEntity<>(response, httpStatus);
	}

	@PostMapping("/save_user_auth")
	@Operation(summary = "Register new User Authentication Endpoint")
	public ResponseEntity<APIResponse> saveUserAuth(@RequestBody SaveUserAuth entity) {
		APIResponse response = new APIResponse();
		HttpStatus httpStatus = HttpStatus.OK;

		try {
			if (entity == null || entity.getLogin_user_id() == null || !StringUtils.hasText(entity.getUser_name())
					|| !StringUtils.hasText(entity.getUser_password())) {

				response.setStatus(CONSTANTS.API_STATUS_GET_FAILURE);
				response.setMessage(CONSTANTS.MSG_PARAM_INVALID);
				return new ResponseEntity<>(response, httpStatus);
			}

			/*
			 * int iStatus = jwtAuthenticationService.save_user_auth(entity);
			 * 
			 * if (iStatus == 0) { response.setStatus(CONSTANTS.API_STATUS_SUCCESS);
			 * response.setMessage(CONSTANTS.MSG_USER_AUTH_REGISTRATION_SUCCESS); } else if
			 * (iStatus == 30) { response.setStatus(CONSTANTS.API_STATUS_INSERT_FAILURE);
			 * response.setMessage(CONSTANTS.MSG_USER_ALREADY_REGISTERED); } else if
			 * (iStatus == 45) { response.setStatus(CONSTANTS.API_STATUS_INSERT_FAILURE);
			 * response.setMessage(CONSTANTS.MSG_INVALID_USER_TYPE); } else {
			 * response.setStatus(CONSTANTS.API_STATUS_INSERT_FAILURE);
			 * response.setMessage(CONSTANTS.MSG_USER_AUTH_REGISTRATION_FAILURE); }
			 */

		} catch (Exception ex) {
			//logger.error("Exception during save_user_auth: ", ex);
			response.setStatus(CONSTANTS.API_STATUS_INSERT_FAILURE);
			response.setMessage(CONSTANTS.MSG_USER_AUTH_REGISTRATION_FAILURE);
		}

		return new ResponseEntity<>(response, httpStatus);
	}
}
