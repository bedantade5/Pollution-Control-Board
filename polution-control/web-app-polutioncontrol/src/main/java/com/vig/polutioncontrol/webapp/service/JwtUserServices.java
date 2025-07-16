package com.vig.polutioncontrol.webapp.service;

import java.net.URI;
import java.util.Arrays;
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
import com.vig.polutioncontrol.common.jwt.model.JwtUser;
import com.vig.polutioncontrol.common.jwt.model.RemoveJwtUser;
import com.vig.polutioncontrol.common.model.APIResponse;
import com.vig.polutioncontrol.common.util.CONSTANTS;

@Service
public class JwtUserServices {

	public List<JwtUser> getAllJwtUserDetails()
	{
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		List<JwtUser> lstJwtArrayDetails = null;
		ObjectMapper mapper = new ObjectMapper();
		
		try 
		{
			String username = "viuser";
			String password = "vig@123";
			String urlAuth = CONSTANTS.baseUrlAuth + "/generateToken";
			URI uriAuth = new URI(urlAuth);
			String auth = username + ":" + password;
			String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
			HttpHeaders headerAuth = new HttpHeaders();
			headerAuth.set("Authorization", "Basic " + encodedAuth);
			MultiValueMap<String, String> mapAuth = new LinkedMultiValueMap<String, String>();
			HttpEntity<MultiValueMap<String, String>> requestAuth = new HttpEntity<MultiValueMap<String, String>>(mapAuth, headerAuth);
			response = restTemplate.postForEntity(uriAuth, requestAuth, APIResponse.class);
			
			if(null != response && null != response.getBody() &&  response.getBody().getStatus().equals(0))
			{
				AccessTokenDetails token = mapper.convertValue(response.getBody().getData(), AccessTokenDetails.class);
				
				String url = CONSTANTS.baseUrlAuth+"/getAllJwtUsersDetails" ;
				URI uri = new URI(url);
				HttpHeaders headers = new HttpHeaders();
				headerAuth.set("Authorization", "Bearer " + token.getAccess_token());
				//headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

				MultiValueMap<String, String> map= new LinkedMultiValueMap<String, String>();
				HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headerAuth);

				response = restTemplate.postForEntity( url, request , APIResponse.class );
				if(null != response && null != response.getBody() &&  response.getBody().getStatus().equals(0))
				{

					JwtUser[] JwtArray = mapper.convertValue(response.getBody().getData(), JwtUser[].class);
					lstJwtArrayDetails = Arrays.asList(JwtArray);
				}
			}
		}
		catch(Exception ex) 
		{
			ex.printStackTrace();
		}
		
		return lstJwtArrayDetails;
	}
	
	public Integer removeJwtUser(RemoveJwtUser entity)
	{
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		Integer iStatus = 0;

		try 
		{
			String username = "viuser";
			String password = "vig@123";
			String urlAuth = CONSTANTS.baseUrlAuth + "/generateToken";
			URI uriAuth = new URI(urlAuth);
			String auth = username + ":" + password;
			String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
			HttpHeaders headerAuth = new HttpHeaders();
			headerAuth.set("Authorization", "Basic " + encodedAuth);
			MultiValueMap<String, String> mapAuth = new LinkedMultiValueMap<String, String>();
			HttpEntity<MultiValueMap<String, String>> requestAuth = new HttpEntity<MultiValueMap<String, String>>(mapAuth, headerAuth);
			response = restTemplate.postForEntity(uriAuth, requestAuth, APIResponse.class);
			
			if(null != response && null != response.getBody() &&  response.getBody().getStatus().equals(0))
			{
				AccessTokenDetails token = mapper.convertValue(response.getBody().getData(), AccessTokenDetails.class);
				
				String url = CONSTANTS.baseUrlAuth + "/removeUserAuth";
				URI uri = new URI(url);
				headerAuth.set("Authorization", "Bearer " + token.getAccess_token());
				HttpEntity<RemoveJwtUser> request = new HttpEntity<RemoveJwtUser>(entity, headerAuth);
				response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);
				if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) 
				{
					iStatus = 0;
				} 
				else if (null != response && null != response.getBody() && response.getBody().getStatus().equals(2)) 
				{
					iStatus = 2;
				} 
				else 
				{
					iStatus = 1;
				}
			}
		} 
		catch (Exception exception) 
		{
			
			iStatus=1;
			exception.printStackTrace();
		}
		return iStatus;
		
	}
	
	public Integer saveJwtUserDetails(JwtUser entity) 
	{
		ResponseEntity<APIResponse> response = null;
		RestTemplate restTemplate = new RestTemplate();
		ObjectMapper mapper = new ObjectMapper();
		Integer iStatus = 0;

		try 
		{
			String username = "viuser";
			String password = "vig@123";
			String urlAuth = CONSTANTS.baseUrlAuth + "/generateToken";
			URI uriAuth = new URI(urlAuth);
			String auth = username + ":" + password;
			String encodedAuth = Base64.getEncoder().encodeToString(auth.getBytes());
			HttpHeaders headerAuth = new HttpHeaders();
			headerAuth.set("Authorization", "Basic " + encodedAuth);
			MultiValueMap<String, String> mapAuth = new LinkedMultiValueMap<String, String>();
			HttpEntity<MultiValueMap<String, String>> requestAuth = new HttpEntity<MultiValueMap<String, String>>(mapAuth, headerAuth);
			response = restTemplate.postForEntity(uriAuth, requestAuth, APIResponse.class);
			
			if(null != response && null != response.getBody() &&  response.getBody().getStatus().equals(0))
			{
				AccessTokenDetails token = mapper.convertValue(response.getBody().getData(), AccessTokenDetails.class);
				
				String url = CONSTANTS.baseUrlAuth + "/registerUserAuth";
				URI uri = new URI(url);
				headerAuth.set("Authorization", "Bearer " + token.getAccess_token());
				HttpEntity<JwtUser> request = new HttpEntity<JwtUser>(entity, headerAuth);
				response = restTemplate.exchange(uri, HttpMethod.POST, request, APIResponse.class);
				if (null != response && null != response.getBody() && response.getBody().getStatus().equals(0)) 
				{
					iStatus = 0;
				} 
				else if (null != response && null != response.getBody() && response.getBody().getStatus().equals(2)) 
				{
					iStatus = 2;
				} 
				else 
				{
					iStatus = 1;
				}
			}
		} 
		catch (Exception exception) 
		{
			
			iStatus=1;
			exception.printStackTrace();
		}
		return iStatus;
		
	}
}
