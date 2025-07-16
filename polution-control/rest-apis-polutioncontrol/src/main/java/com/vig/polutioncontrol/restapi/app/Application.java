package com.vig.polutioncontrol.restapi.app;

import java.util.Arrays;
import java.util.stream.IntStream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={("com.vig.polutioncontrol")})
@MapperScan("com.vig.polutioncontrol")
public class Application extends SpringBootServletInitializer
{
	//private static final Logger LOGGER=LoggerFactory.getLogger(Application.class);
	
	public static void main(String[] args) 
	{
		SpringApplication.run(Application.class, args);
	}
}
