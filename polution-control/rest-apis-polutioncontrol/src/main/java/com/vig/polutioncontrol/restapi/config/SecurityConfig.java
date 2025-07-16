package com.vig.polutioncontrol.restapi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.nimbusds.jose.jwk.JWK;
import com.nimbusds.jose.jwk.JWKSet;
import com.nimbusds.jose.jwk.RSAKey;
import com.nimbusds.jose.jwk.source.ImmutableJWKSet;
import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import com.vig.polutioncontrol.restapi.service.JwtAutheticationService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Autowired
	JwtAutheticationService userDetailService;
	private RsaKeyProperties rsaKeys = null;

	public SecurityConfig() {
		rsaKeys = new RsaKeyProperties();
		rsaKeys.loadPrivateKey();
		rsaKeys.loadPublicKey();
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		return http.csrf(csrf -> csrf.disable())
				.authorizeRequests(auth -> auth.antMatchers("/user/auth/**").permitAll().antMatchers("/v3/api-docs/**")
						.permitAll().antMatchers("/swagger-ui*/**").permitAll().antMatchers("/actuator").permitAll()
						.antMatchers("/rs/v1/master/getDetails").permitAll()
						.antMatchers("/rs/v1/master/getEnvironmentalReport").permitAll()
						.anyRequest().authenticated())
				.userDetailsService(userDetailService).oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
				.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
				.httpBasic(Customizer.withDefaults()).build();
	}

	@Bean
	JwtDecoder jwtDecoder() {
		return NimbusJwtDecoder.withPublicKey(rsaKeys.getPublicKey()).build();
	}

	@Bean
	JwtEncoder jwtEncoder() {
		JWK jwk = new RSAKey.Builder(rsaKeys.getPublicKey()).privateKey(rsaKeys.getPrivateKey()).build();
		JWKSource<SecurityContext> jwks = new ImmutableJWKSet<SecurityContext>(new JWKSet(jwk));
		return new NimbusJwtEncoder(jwks);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}