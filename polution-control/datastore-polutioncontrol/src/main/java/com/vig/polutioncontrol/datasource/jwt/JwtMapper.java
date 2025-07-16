package com.vig.polutioncontrol.datasource.jwt;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.mapping.StatementType;

import com.vig.polutioncontrol.common.jwt.dto.JwtUserDTO;
import com.vig.polutioncontrol.common.jwt.dto.RemoveUserDTO;
import com.vig.polutioncontrol.common.jwt.dto.SetJwtUserDTO;
import com.vig.polutioncontrol.common.login.dto.SaveUserAuthDTO;

@Mapper
public interface JwtMapper {
	
	@Insert("CALL `sp_saveUserDetails`("
			+ "#{UserName,mode=IN,jdbcType=VARCHAR},"
			+ "#{UserPassword,mode=IN,jdbcType=VARCHAR})")
	@Options(statementType=StatementType.CALLABLE)
	Integer registerUserAuth(SetJwtUserDTO entity);

	@Select("CALL `sp_getUserDetailsByUsername`(#{UserName})")
	JwtUserDTO loadUserByUsername(@Param("UserName")String UserName);
	
	@Update("CALL `sp_deleteJwtUserAuth`("
			+ "#{UserID,mode=IN,jdbcType=INTEGER},"
			+ "#{DeletedBy,mode=IN,jdbcType=INTEGER},"
			+ "#{ErrorCode,mode=OUT,jdbcType=INTEGER})")
	@Options(statementType=StatementType.CALLABLE)
	void removeUserAuth(RemoveUserDTO removeUserDTO);
	
	@Select("CALL `sp_getAllJwtUsers`()")
	List<JwtUserDTO> getAllJwtUsers();

	@Insert("CALL `sp_saveNewLoginUserV1`("
			+ "#{UserName,mode=IN,jdbcType=VARCHAR},"
			+ "#{UserPassword,mode=IN,jdbcType=VARCHAR})")
	@Options(statementType=StatementType.CALLABLE)
	void save_user_auth(SaveUserAuthDTO setuserdto);
	/*
	 * @Update("CALL `sp_updateAdminUserPassword`(" +
	 * "#{LoginUserID,mode=IN,jdbcType=INTEGER}," +
	 * "#{UserName,mode=IN,jdbcType=VARCHAR}," +
	 * "#{OldPassword,mode=IN,jdbcType=VARCHAR}," +
	 * "#{NewPassword,mode=IN,jdbcType=VARCHAR}," +
	 * "#{ErrorCode,mode=OUT,jdbcType=INTEGER})")
	 * 
	 * @Options(statementType=StatementType.CALLABLE) void
	 * reset_user_password(ResetUserPasswordDTO resetDTO);
	 * 
	 * @Select("CALL `sp_updateOTPByUser`(" +
	 * "#{UserName,mode=IN,jdbcType=VARCHAR}," +
	 * "#{EncryptedOTP,mode=IN,jdbcType=VARCHAR}," +
	 * "#{ErrorCode,mode=OUT,jdbcType=INTEGER})")
	 * 
	 * @Options(statementType=StatementType.CALLABLE) void
	 * update_otp(UpdateOtpReqDTO updateOtpReqDTO);
	 */
}
