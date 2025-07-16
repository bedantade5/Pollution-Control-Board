package com.vig.polutioncontrol.webapp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.common.model.APIResponse;
import com.vig.polutioncontrol.common.model.GetUserLastlocation;
import com.vig.polutioncontrol.common.util.CONSTANTS;
import com.vig.polutioncontrol.webapp.model.SurveyMapData;
import com.vig.polutioncontrol.webapp.service.DashboardServices;

@Controller
public class DashboardController {
	
	@Autowired
	DashboardServices dashboardservices;
	

	
	/*
	 * @GetMapping("/dashboard") public String dashboard(HttpSession session, Model
	 * model) { String strRet = ""; DashboardDetailsResp dashboardResponse = null;
	 * try { DashboardDetailsReq dashboardReq = new DashboardDetailsReq();
	 * LoginResponse loginResponse = (LoginResponse)
	 * SecurityContextHolder.getContext().getAuthentication() .getPrincipal();
	 * 
	 * model.addAttribute("userName", loginResponse.getUser_full_name());
	 * 
	 * dashboardReq.setBoundary_level_id(loginResponse.getBoundary_level_id());
	 * dashboardReq.setBoundary_id(loginResponse.getBoundary_id());
	 * dashboardReq.setLogin_user_id(loginResponse.getUser_id());
	 * 
	 * dashboardResponse =
	 * dashboardservices.getDashboardDetails(loginResponse.getUser_name(),
	 * loginResponse.getUser_password(), dashboardReq);
	 * 
	 * if (dashboardResponse != null) { model.addAttribute("dashboardDetails",
	 * dashboardResponse); }
	 * 
	 * strRet = "dashboard2";
	 * 
	 * } catch (Exception ex) { ex.printStackTrace(); } return strRet; }
	 */

	

}
