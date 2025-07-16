package com.vig.polutioncontrol.restapi.service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.stereotype.Service;

import com.vig.polutioncontrol.common.jwt.dto.JwtUserDTO;
import com.vig.polutioncontrol.common.jwt.model.AccessTokenDetails;
import com.vig.polutioncontrol.datasource.jwt.JwtMapper;

@Service
public class JwtAutheticationService implements UserDetailsService {
	@Autowired
	JwtMapper jwtMapper;
	private final JwtEncoder encoder;
	private final PasswordEncoder passwordEncoder;

	public JwtAutheticationService(JwtEncoder encoder, PasswordEncoder passwordEncoder) {
		this.encoder = encoder;
		this.passwordEncoder = passwordEncoder;
	}

	public AccessTokenDetails generateToken(Authentication authentication) {
		AccessTokenDetails tokenDetails = null;

		try {
			Instant now = Instant.now();
			String scope = authentication.getAuthorities().stream().map(GrantedAuthority::getAuthority)
					.collect(Collectors.joining(" "));
			JwtClaimsSet claims = JwtClaimsSet.builder().issuer("self").issuedAt(now)
					.expiresAt(now.plus(1, ChronoUnit.DAYS)).subject(authentication.getName()).claim("scope", scope)
					.build();

			String strToken = this.encoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();

			if (null != strToken && !strToken.trim().equals("")) {
				tokenDetails = new AccessTokenDetails();

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss")
						.withZone(ZoneId.systemDefault());

				String tokenCreatedAt = formatter.format(now);
				String tokenExpiresAt = formatter.format(now.plus(1, ChronoUnit.DAYS));

				tokenDetails.setAccess_token(strToken);
				tokenDetails.setCreated_at(tokenCreatedAt);
				tokenDetails.setExpires_at(tokenExpiresAt);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			tokenDetails = null;
		}

		return tokenDetails;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserDetails user = null;

		try {
			JwtUserDTO userDTO = jwtMapper.loadUserByUsername(username);

			if (null == userDTO) {
				throw new UsernameNotFoundException("User not found with username: " + username);
			} else {
				user = new User(userDTO.getUserName(), userDTO.getUserPassword(),
						Arrays.stream(userDTO.getUserRole().split(",")).map(SimpleGrantedAuthority::new)
								.collect(Collectors.toList()));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return user;
	}
}
