package org.springframework.boot.app.security;

import org.springframework.boot.app.constants.Constants;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
  @Override
  protected void configure(HttpSecurity http) throws Exception {
//    http.csrf().disable().authorizeRequests()
//        .antMatchers("/").permitAll()
//        .antMatchers(HttpMethod.POST, Constants.LOGIN_URL).permitAll()
//        .antMatchers(HttpMethod.POST, "/swagger-ui.html").permitAll()
//        .anyRequest().authenticated()
//        .and()
//        // We filter the api/login requests
//        .addFilterBefore(new JWTLoginFilter("/login", authenticationManager()),
//                UsernamePasswordAuthenticationFilter.class)
////        .addFilterBefore(new JWTLoginFilter("/swagger-ui.html", authenticationManager()),
////                UsernamePasswordAuthenticationFilter.class)
//        // And filter other requests to check the presence of JWT in header
//        .addFilterBefore(new JWTAuthenticationFilter(),
//                UsernamePasswordAuthenticationFilter.class);
  }
  @Override
  public void configure(WebSecurity web) throws Exception {
      web.ignoring().antMatchers("/swagger-ui.html");
  }
  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    // Create a default account
    auth.inMemoryAuthentication()
        .withUser("admin")
        .password("password")
        .roles("ADMIN");
  }
}