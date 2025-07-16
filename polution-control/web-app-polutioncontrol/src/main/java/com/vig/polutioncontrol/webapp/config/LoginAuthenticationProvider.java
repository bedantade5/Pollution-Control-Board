package com.vig.polutioncontrol.webapp.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import com.vig.polutioncontrol.common.login.model.LoginDetails;
import com.vig.polutioncontrol.common.login.model.LoginResponse;
import com.vig.polutioncontrol.webapp.service.LoginServices;

@Component
public class LoginAuthenticationProvider implements AuthenticationProvider 
{
	@Autowired LoginServices loginService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException 
	{
		List<GrantedAuthority> authorities = null;
		LoginDetails logindetails = null;
		LoginResponse loginresponse = null;
		
        try 
        {
        	logindetails = new LoginDetails();
        	logindetails.setUser_name(authentication.getName());
        	logindetails.setPassword((String) authentication.getCredentials());
            
        	loginresponse = loginService.LoginAuthentication(logindetails);
        	
        	if(loginresponse != null)
        	{
				/*
				 * PasswordEncoder encoder = passwordEncoder();
				 * 
				 * Boolean flag = encoder.matches((String) authentication.getCredentials(),
				 * loginresponse.getUser_password());
				 * 
				 * if (flag == false) { return null; }
				 */
				 
        	}
        	else if(loginresponse == null)
        	{
        		return null;
        	}
        	       	
        	authorities = new ArrayList<>();
    		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
    		
    		loginresponse.setUser_password(authentication.getCredentials().toString());
		}
        catch (Exception e)
        {
			e.printStackTrace();
		}
        
        return new UsernamePasswordAuthenticationToken(loginresponse, authentication.getCredentials(), authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) 
	{
		return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
	}
	
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
