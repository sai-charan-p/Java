//package com.dev.app.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.oauth2.jwt.JwtDecoder;
//import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
//
////@Configuration
//public class SecurityConfig {
//
//    // Replace with your Okta JWKS URI
//    private static final String OKTA_JWKS_URI = "https://integrator-9439724.okta.com/oauth2/default/v1/keys";
//
//    /**
//     * Bean to decode JWT tokens issued by Okta
//     */
//    @Bean
//    public JwtDecoder jwtDecoder() {
//        return NimbusJwtDecoder.withJwkSetUri(OKTA_JWKS_URI).build();
//    }
//
//    /**
//     * Main Spring Security filter chain
//     */
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http
//            // Authorize requests
//            .authorizeHttpRequests(auth -> auth
//                .requestMatchers(
//                    "/", 
//                    "/index.html",
//                    "/css/**",
//                    "/js/**"
//                ).permitAll() // public resources
//                .anyRequest().authenticated() // everything else requires login
//            )
//            // OAuth2 Login for browser clients
//            .oauth2Login(oauth2 -> {})
//            // Resource Server for APIs using JWT validation
//            .oauth2ResourceServer(resource -> resource.jwt());
//
//        return http.build();
//    }
//}
