package com.vig.polutioncontrol.restapi.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info; 
import io.swagger.v3.oas.models.security.SecurityRequirement; 
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

@Configuration
public class OpenAPIConfig {

	  //private final String moduleName;
	  //private final String apiVersion;

	  /*public OpenAPIConfig(
	      @Value("${module-name}") String moduleName,
	      @Value("${api-version}") String apiVersion) {
	    this.moduleName = moduleName;
	    this.apiVersion = apiVersion;
	  }*/

	  @Bean
	  public OpenAPI customOpenAPI() {
	    final String securitySchemeName = "bearerAuth";
	    final String apiTitle = String.format("%s API", StringUtils.capitalize("NKDA-SURVEY-APP"));
	    return new OpenAPI()
	        .addSecurityItem(new SecurityRequirement().addList(securitySchemeName))
	        .components(
	            new Components()
	                .addSecuritySchemes(securitySchemeName,
	                    new SecurityScheme()
	                        .name(securitySchemeName)
	                        .type(SecurityScheme.Type.HTTP)
	                        .scheme("bearer")
	                        .bearerFormat("JWT")
	                )
	        )
	        .info(new Info().title(apiTitle).version("1.0.0"));
	  }
}
