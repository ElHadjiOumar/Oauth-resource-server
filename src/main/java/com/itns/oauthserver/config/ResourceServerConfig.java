package com.itns.oauthserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * It's a class that extends WebSecurityConfigurerAdapter and overrides the configure(HttpSecurity
 * http) method.
 */
@EnableWebSecurity
public class ResourceServerConfig {

/**
 * If the request is to the /api/** path, then the user must have the SCOPE_api.read authority.
 * 
 * @param http The HttpSecurity object that is used to configure the security filter chain.
 * @return A SecurityFilterChain
 */
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .mvcMatchers("/api/**")
                .access("hasAuthority('SCOPE_api.read')")
                .and()
                .oauth2ResourceServer()
                .jwt();
        return http.build();
    }
}
