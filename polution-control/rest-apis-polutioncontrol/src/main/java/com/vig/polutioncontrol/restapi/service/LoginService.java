package com.vig.polutioncontrol.restapi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.vig.polutioncontrol.common.login.dto.GetDetailsDTO;
import com.vig.polutioncontrol.common.login.dto.GetReportDTO;
import com.vig.polutioncontrol.common.login.dto.GetReportResp;
import com.vig.polutioncontrol.common.login.dto.LoginRequestDTO;
import com.vig.polutioncontrol.common.login.dto.LoginResponseDTO;
import com.vig.polutioncontrol.common.login.model.GetDetailsResp;
import com.vig.polutioncontrol.common.login.model.LoginDetails;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.datasource.login.LoginMapper;

@Service
public class LoginService {

	@Autowired
	LoginMapper loginmapper;

	public LoginResponse LoginAuthentication(LoginDetails entity) {
		Integer istatus = 0;
		LoginResponse loginreponse = null;
		LoginResponseDTO loginResponsedDTO = null;
		LoginRequestDTO loginRequestDTO = null;
		String encPassword = "";

		try {
			PasswordEncoder encoder = passwordEncoder();
			encPassword = encoder.encode(entity.getPassword());
			loginreponse = new LoginResponse();

			loginRequestDTO = new LoginRequestDTO();
			loginRequestDTO.setUserName(entity.getUser_name());
			loginRequestDTO.setUserPassword(encPassword);

			loginResponsedDTO = loginmapper.getUserLogin1(loginRequestDTO);

			if (loginRequestDTO.getErrorCode() == 0) {
				if (loginResponsedDTO != null) {
					Boolean flag = encoder.matches((String) entity.getPassword(), loginResponsedDTO.getUserPassword());

					if (flag == false) {
						loginreponse.setError_code(4);
					} else {
						loginreponse.setUser_name(loginResponsedDTO.getUserName());
						loginreponse.setUser_password(loginResponsedDTO.getUserPassword());
						loginreponse.setError_code(0);
					}
				}
			} else if (loginRequestDTO.getErrorCode() == 1) {
				loginreponse.setError_code(1);
			} else if (loginRequestDTO.getErrorCode() == 2) {
				loginreponse.setError_code(2);
			} else if (loginRequestDTO.getErrorCode() == 3) {
				loginreponse.setError_code(3);
			} else {
				loginreponse.setError_code(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			loginreponse = null;
		}

		return loginreponse;
	}

	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public List<GetDetailsResp> getDetails(String dt) {
		List<GetDetailsResp> detailsRespList = new ArrayList<>();
		try {
			List<GetDetailsDTO> detailsDTOList = loginmapper.getDetails(dt);

			if (detailsDTOList != null && !detailsDTOList.isEmpty()) {
				for (GetDetailsDTO detailsDTO : detailsDTOList) {
					if (detailsDTO != null) {
						GetDetailsResp detailsResp = new GetDetailsResp();

						detailsResp.setDateTime(detailsDTO.getDateAndTime());
						detailsResp.setTemperature(detailsDTO.getTemperature());
						detailsResp.setHumidity(detailsDTO.getHumidity());
						detailsResp.setPressure(detailsDTO.getPressure());
						detailsResp.setAltitude(detailsDTO.getAltitude());
						detailsResp.setGasResistance(detailsDTO.getGasResistance());
						detailsResp.setWaterFlow(detailsDTO.getWaterFlow());
						detailsResp.setTotalWaterFlowHour(detailsDTO.getTotalWaterFlowPerHour());
						detailsResp.setTdsValue(detailsDTO.getTdsValue());
						detailsResp.setpHLevel(detailsDTO.getpHLevel());
						detailsResp.setOxygenLevel(detailsDTO.getOxygenLevel());
						detailsResp.setPm25Level(detailsDTO.getPm25Level());
						detailsResp.setPm10Level(detailsDTO.getPm10Level());

						detailsRespList.add(detailsResp);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			detailsRespList = null;
		}

		return detailsRespList;
	}

	public List<GetReportResp> getEnvironmentalReport(String startDateTime, String endDateTime) {
		List<GetReportResp> reportRespList = new ArrayList<>();
		try {
			List<GetReportDTO> reportDTOList = loginmapper.getEnvironmentalReport(startDateTime, endDateTime);

			if (reportDTOList != null && !reportDTOList.isEmpty()) {
				for (GetReportDTO reportDTO : reportDTOList) {
					if (reportDTO != null) {
						GetReportResp reportResp = new GetReportResp();

						reportResp.setDateAndTime(reportDTO.getDateAndTime());
						reportResp.setTemperature(reportDTO.getTemperature());
						reportResp.setHumidity(reportDTO.getHumidity());
						reportResp.setPressure(reportDTO.getPressure());
						reportResp.setAltitude(reportDTO.getAltitude());
						reportResp.setGasResistance(reportDTO.getGasResistance());
						reportResp.setWaterFlow(reportDTO.getWaterFlow());
						reportResp.setTotalWaterFlowPerHour(reportDTO.getTotalWaterFlowPerHour());
						reportResp.setTdsValue(reportDTO.getTdsValue());
						reportResp.setPhLevel(reportDTO.getPhLevel());
						reportResp.setOxygenLevel(reportDTO.getOxygenLevel());
						reportResp.setPm25Level(reportDTO.getPm25Level());
						reportResp.setPm10Level(reportDTO.getPm10Level());

						reportRespList.add(reportResp);
					}
				}
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			reportRespList = null;
		}

		return reportRespList;
	}
}
