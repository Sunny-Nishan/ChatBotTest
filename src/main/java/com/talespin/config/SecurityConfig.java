package com.talespin.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	/*@Autowired
	@Qualifier("userDetailsService")
	UserDetailsService userDetailsService;*/

	@Autowired
	CustomSuccessHandler customSuccessHandler;
	
	/*@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}*/

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/superadmin/**").access("hasRole('ROLE_SUPERADMIN')")
		.antMatchers("/consumer/**").access("hasRole('ROLE_CONSUMER')")
		.and().formLogin().loginPage("/login.html").successHandler(customSuccessHandler)
		.usernameParameter("username").passwordParameter("password")
		.failureUrl("/login.html?error")
		.and().csrf()
		.and().exceptionHandling().accessDeniedPage("/403.html")
		.and().logout().logoutSuccessUrl("/login.html?logout");
		
		http.sessionManagement().maximumSessions(1).expiredUrl("/login.html?expired");
		
		http.csrf().disable();
	}
	
	/*@Bean
	public PasswordEncoder passwordEncoder(){
		PasswordEncoder encoder = new BCryptPasswordEncoder();
		return encoder;
	}*/
	
}