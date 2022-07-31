package com.employee.onboarding.engine.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private final PasswordEncoder passwordEncoder;
	
	@Autowired
	public WebSecurityConfig(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().configurationSource(corsConfigurationSource());
//        http.csrf().disable();
//        http.authorizeRequests().antMatchers("/").permitAll();
//        http.headers().frameOptions().disable();
//    }
//
//	    CorsConfigurationSource corsConfigurationSource() {
//		
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.addAllowedOrigin("*");
//		configuration.addAllowedHeader("*");
//		configuration.addAllowedOriginPattern("*");
//		configuration.addAllowedMethod("*");
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		// TODO Auto-generated method stub
//		return source;
	
	
//	}
	
	// Basic Authorization
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
				.authorizeHttpRequests()
				.anyRequest()
				.authenticated()
				.and()
				.httpBasic();
	}
	
	@Override
	@Bean
	protected UserDetailsService userDetailsService() {
		UserDetails demoUser = User.builder()
			.username("demo")
			.password(passwordEncoder.encode("pass"))
			.roles("Employee") //role employee
			.build();
		
		return new InMemoryUserDetailsManager(demoUser);
		
	}
	
}
