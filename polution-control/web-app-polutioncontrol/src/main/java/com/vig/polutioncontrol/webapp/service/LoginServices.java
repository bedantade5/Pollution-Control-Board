package com.vig.polutioncontrol.webapp.service;

import java.net.URI;
import java.net.URLEncoder;
import java.util.Base64;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vig.polutioncontrol.common.jwt.model.AccessTokenDetails;
import com.vig.polutioncontrol.common.login.dto.GetReportResp;
import com.vig.polutioncontrol.common.login.model.GetDetailsResp;
import com.vig.polutioncontrol.common.login.model.LoginDetails;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.common.login.model.LogoutDetails;
import com.vig.polutioncontrol.common.model.APIResponse;
import com.vig.polutioncontrol.common.util.CONSTANTS;
import com.vig.polutioncontrol.datasource.login.LoginMapper;

@Service
public class LoginServices {
	private LoginMapper loginmapper;

	public LoginResponse LoginAuthentication(LoginDetails entity) {
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		LoginResponse loginresponse = new LoginResponse();

		try {
			String username = entity.getUser_name();
			String password = entity.getPassword();
			String urlAuth = CONSTANTS.baseUrlAuth + "/generateToken";
			URI uriAuth = new URI(urlAuth);
			String auth = username + ":" + password;
			String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
			HttpHeaders headerAuth = new HttpHeaders();
			headerAuth.set("Authorization", "Basic " + encodedAuth);
			MultiValueMap<String, String> mapAuth = new LinkedMultiValueMap<String, String>();
			HttpEntity<MultiValueMap<String, String>> requestAuth = new HttpEntity<MultiValueMap<String, String>>(
					mapAuth, headerAuth);
			response = restTemplate.postForEntity(uriAuth, requestAuth, APIResponse.class);

			if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) {
				AccessTokenDetails token = mapper.convertValue(response.getBody().getData(), AccessTokenDetails.class);

				String url = CONSTANTS.baseUrl + "/user_authentication";
				URI uri = new URI(url);
				headerAuth.set("Authorization", "Bearer " + token.getAccess_token());
				HttpEntity<LoginDetails> request = new HttpEntity<LoginDetails>(entity, headerAuth);
				response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);

				if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) {
					loginresponse = mapper.convertValue(response.getBody().getData(), LoginResponse.class);
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			loginresponse = null;
		}

		return loginresponse;
	}

	public Integer logoutUser(LoginResponse entity) {
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		LogoutDetails logoutdetails = new LogoutDetails();
		Integer logoutStatus = 0;

		try {
			String username = entity.getUser_name();
			String password = entity.getUser_password();
			String urlAuth = CONSTANTS.baseUrlAuth + "/generateToken";
			URI uriAuth = new URI(urlAuth);
			String auth = username + ":" + password;
			String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
			HttpHeaders headerAuth = new HttpHeaders();
			headerAuth.set("Authorization", "Basic " + encodedAuth);
			MultiValueMap<String, String> mapAuth = new LinkedMultiValueMap<String, String>();
			HttpEntity<MultiValueMap<String, String>> requestAuth = new HttpEntity<MultiValueMap<String, String>>(
					mapAuth, headerAuth);
			response = restTemplate.postForEntity(uriAuth, requestAuth, APIResponse.class);

			if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) {
				AccessTokenDetails token = mapper.convertValue(response.getBody().getData(), AccessTokenDetails.class);

				String url = CONSTANTS.baseUrl + "/logoutUser";
				URI uri = new URI(url);
				headerAuth.set("Authorization", "Bearer " + token.getAccess_token());
				HttpEntity<LogoutDetails> request = new HttpEntity<LogoutDetails>(logoutdetails, headerAuth);
				response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);

				if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) {
					logoutStatus = 0;
				} else {
					logoutStatus = 1;
				}
			}
		} catch (Exception exception) {
			exception.printStackTrace();
			logoutStatus = 1;
		}

		return logoutStatus;
	}

	public List<GetDetailsResp> fetchSurveyDetails(String dt) {

		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		List<GetDetailsResp> detailsList = null;

		try {
			String encodedDt = URLEncoder.encode(dt, "UTF-8");
			String url = CONSTANTS.baseUrl + "/getDetails?dt=" + encodedDt;
			URI uri = new URI(url);

			HttpEntity<String> request = new HttpEntity<>(null);

			response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);

			if (response != null && response.getBody() != null && response.getBody().getStatus().equals(0)) {
				detailsList = mapper.convertValue(response.getBody().getData(),
						mapper.getTypeFactory().constructCollectionType(List.class, GetDetailsResp.class));
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			detailsList = null;
		}

		return detailsList;
	}

	public List<GetReportResp> fetchEnvironmentalReport(String startDateTime, String endDateTime) {
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		List<GetReportResp> reportList = null;

		try {
			String encodedStartDateTime = URLEncoder.encode(startDateTime, "UTF-8");
			String encodedEndDateTime = URLEncoder.encode(endDateTime, "UTF-8");

			StringBuilder urlBuilder = new StringBuilder(CONSTANTS.baseUrl).append("/getEnvironmentalReport")
					.append("?startDateTime=").append(encodedStartDateTime).append("&endDateTime=")
					.append(encodedEndDateTime);

			URI uri = new URI(urlBuilder.toString());

			HttpEntity<String> request = new HttpEntity<>(null);

			response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);

			if (response != null && response.getBody() != null && response.getBody().getStatus().equals(0)) {
				reportList = mapper.convertValue(response.getBody().getData(),
						mapper.getTypeFactory().constructCollectionType(List.class, GetReportResp.class));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			reportList = null;
		}
		return reportList;
	}
}