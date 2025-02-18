package com.artofcode.artofcodebck.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Configuration
@EnableScheduling
public class OpenAPIConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // Autoriser toutes les origines
                .allowedMethods("*") // Autoriser toutes les méthodes (GET, POST, PUT, DELETE, etc.)
                .allowedHeaders("*"); // Autoriser tous les en-têtes

    }




}
