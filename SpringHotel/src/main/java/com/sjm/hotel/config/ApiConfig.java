package com.sjm.hotel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

@Configuration
public class ApiConfig {

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}

	public ObjectWriter objectWriter(ObjectMapper objectMapper) {
		return objectMapper.writerWithDefaultPrettyPrinter();
	}

}
