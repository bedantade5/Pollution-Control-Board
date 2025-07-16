package com.vig.polutioncontrol.datasource.login;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.StatementType;

import com.vig.polutioncontrol.common.login.dto.GetDetailsDTO;
import com.vig.polutioncontrol.common.login.dto.GetReportDTO;
import com.vig.polutioncontrol.common.login.dto.LoginRequestDTO;
import com.vig.polutioncontrol.common.login.dto.LoginResponseDTO;

@Mapper
public interface LoginMapper {

	@Select("CALL `sp_getUserDetailsByUsername`(#{inUserName,mode=IN,jdbcType=VARCHAR})")
	@Options(statementType = StatementType.CALLABLE)
	LoginResponseDTO getUserLogin(@Param("inUserName") String userName);
	
	@Select("CALL sp_SimpleLoginUser("
			+ "#{UserName,mode=IN,jdbcType=VARCHAR},"
			+ "#{UserPassword,mode=IN,jdbcType=VARCHAR},"
			+ "#{ErrorCode,mode=OUT,jdbcType=INTEGER})")
	@Options(statementType=StatementType.CALLABLE)
	LoginResponseDTO getUserLogin1(LoginRequestDTO loginRequestDTO);

    @Select("CALL `get_details`(#{dt})")
    List<GetDetailsDTO> getDetails(@Param("dt") String dt);

    @Select("CALL `get_environmental_report`(#{startDateTime}, #{endDateTime})")
    List<GetReportDTO> getEnvironmentalReport(
        @Param("startDateTime") String startDateTime,
        @Param("endDateTime") String endDateTime
    );
}
