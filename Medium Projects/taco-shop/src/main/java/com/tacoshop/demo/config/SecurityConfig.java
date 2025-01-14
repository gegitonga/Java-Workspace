package com.tacoshop.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.tacoshop.demo.services.CustomUserDetailService;

@Configuration
public class SecurityConfig {

	private final CustomUserDetailService customUserDetailService;

	public SecurityConfig(CustomUserDetailService customUserDetailService) {
		this.customUserDetailService = customUserDetailService;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests(auth -> auth
				.requestMatchers(HttpMethod.POST, "/api/ingredients").hasAuthority("SCOPE_writeIngredients")
				.requestMatchers(HttpMethod.DELETE, "/api/ingredients").hasAuthority("SCOPE_deleteIngredients")
				.requestMatchers("/design", "/orders").hasRole("USER")
				.requestMatchers("/", "/**").permitAll()
			)
			.formLogin(form -> form
				.loginPage("/login")
				.defaultSuccessUrl("/design", true)
			)
			.csrf(csrf -> csrf.disable()) // Enable or configure CSRF protection as needed
			.oauth2ResourceServer(oauth2 -> oauth2.jwt(Customizer.withDefaults())); // Enable OAuth2 Resource Server with JWT
		
		return http.build();
	}


}
