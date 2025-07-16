package com.vig.polutioncontrol.webapp.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

import com.vig.polutioncontrol.common.login.dto.GetReportResp;
import com.vig.polutioncontrol.common.login.model.GetDetailsResp;
import com.vig.polutioncontrol.common.login.model.LoginDetails;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.webapp.service.LoginServices;

@Controller
public class LoginController {

	@Autowired
	private LoginServices loginService;

	@GetMapping({ "/", "/about" })
	public String about() {
		return "about";
	}

	@GetMapping("/dashboard")
	public String dashboard(Model model) {

		try {
			
			String dt = "2025-06-26 10:30:00";
			List<GetDetailsResp> detailsList = loginService.fetchSurveyDetails(dt);

			model.addAttribute("surveyDetails", detailsList.isEmpty() ? null : detailsList.get(0));

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("surveyDetails", null);
		}

		return "dashboard";
	}

	@GetMapping("/report")
	public String environmentalReport(@RequestParam(value = "startDateTime", required = false) String startDateTime,
			@RequestParam(value = "endDateTime", required = false) String endDateTime, Model model,
			HttpSession session) {
		try {
			model.addAttribute("startDateTime", startDateTime);
			model.addAttribute("endDateTime", endDateTime);

			if (isNullOrEmpty(startDateTime) || isNullOrEmpty(endDateTime)) {
				model.addAttribute("reportDetails", null);
				return "report";
			}

			//String userName = (String) session.getAttribute("userName");
			//String userPassword = (String) session.getAttribute("userPassword");

			

			List<GetReportResp> reportList = loginService.fetchEnvironmentalReport(
					startDateTime, endDateTime);
			model.addAttribute("reportDetails", reportList);

		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("reportDetails", null);
		}

		return "report";
	}

	@GetMapping("/login")
	public String showLoginPage(HttpSession session, Model model) {
		try {
			String loginFailedMsg = (String) session.getAttribute("loginfailedMsg");
			if (loginFailedMsg != null) {
				model.addAttribute("loginfailedMsg", loginFailedMsg);
				session.removeAttribute("loginfailedMsg");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "login";
	}

	/*
	 * @PostMapping("/loginfordassboard") public String
	 * authenticateUser(@RequestParam("username") String
	 * username, @RequestParam("password") String password, HttpSession session,
	 * Model model) { try { LoginDetails loginDetails = new LoginDetails();
	 * loginDetails.setUser_name(username); loginDetails.setPassword(password);
	 * 
	 * LoginResponse loginResponse = loginService.LoginAuthentication(loginDetails);
	 * 
	 * if (loginResponse != null) { session.setAttribute("loggedInUser",
	 * loginResponse.getUser_name()); return "redirect:/dashboard"; } else {
	 * model.addAttribute("loginfailedMsg", "Invalid username or password."); return
	 * "redirect:/login"; }
	 * 
	 * } catch (Exception ex) { ex.printStackTrace();
	 * model.addAttribute("loginfailedMsg", "An error occurred during login.");
	 * return "redirect:/login"; } }
	 */

	@GetMapping("/LoginFailed")
	public String loginFailed(HttpSession session) {
		session.setAttribute("loginfailedMsg", "Invalid login, please try again!");
		return "redirect:/login";
	}

	private boolean isNullOrEmpty(String value) {
		return value == null || value.trim().isEmpty();
	}
}
