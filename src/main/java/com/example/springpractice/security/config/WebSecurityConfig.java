package com.example.springpractice.security.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Slf4j
@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        log.info("-------securityFilterChain-------");
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers("/managers/**").hasRole("MANAGER")
//                .antMatchers("/partners/**").hasRole("PARTNER")
//                .anyRequest().authenticated()
//                .and()
//                .httpBasic();
        http.csrf().disable();

        return http.build();
    }
}
