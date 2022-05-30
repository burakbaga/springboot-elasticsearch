package com.course.practicaljava.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
	
	@Bean
	public OpenAPI practivalJavaOpenApi() {
		var info = new Info().title("Practival Java API").description("OpenApi (swagger) documentation auto from code.").version("1.0");
		
		return new OpenAPI().info(info);
	}
	
}
