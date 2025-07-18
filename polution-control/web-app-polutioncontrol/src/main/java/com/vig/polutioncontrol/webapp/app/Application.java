package com.vig.polutioncontrol.webapp.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.vig.polutioncontrol.webapp"})
public class Application extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder builder)
	{
		return builder.sources(Application.class);
	}
	
	public static void main(String[] args)  {
		
		SpringApplication.run(Application.class);
	}
}
