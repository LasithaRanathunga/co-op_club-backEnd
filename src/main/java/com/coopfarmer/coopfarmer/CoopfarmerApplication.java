package com.coopfarmer.coopfarmer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@SpringBootApplication
public class CoopfarmerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoopfarmerApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**") // Apply to all endpoints
						.allowedOrigins("http://localhost:5173/") // Specify allowed origins
						.allowedMethods("GET", "POST", "PUT", "DELETE") // Specify allowed HTTP methods
						.allowedHeaders("*") // Specify allowed headers
						.allowCredentials(true); // Allow credentials
			}
		};
	}
}
