package com.vig.polutioncontrol.webapp.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

//@Component
public class CustomOncePerRequestFilter extends OncePerRequestFilter
{
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("#################" + request.getHeader("Host"));
		System.out.println("#################" + request.getHeader("MirrorID"));
		filterChain.doFilter(request, response);
	}
}
