package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.*;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class UserConfig {

    @Bean
    public UserDetailsService userDetailsService() {

        UserDetails user = User
                .withUsername("admin")
                .password("{noop}admin")  // no encoding for now
                .roles("USER")
                .build();

        return new InMemoryUserDetailsManager(user);
    }
}