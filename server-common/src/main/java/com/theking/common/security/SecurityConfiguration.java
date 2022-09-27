package com.theking.common.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * @author TheKing
 * @version 1.0
 * @className SecurityConfiguration
 * @description Spring Security configuration
 * @date 2022/9/20 16:24
 */
@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeHttpRequests()
                .antMatchers("/user/*","/login").permitAll()
                .antMatchers("/teacher").hasRole("TEACHER")
                .antMatchers("/admin/*").hasRole("ADMIN")
                .anyRequest().authenticated();

        return http.build();
    }

}
