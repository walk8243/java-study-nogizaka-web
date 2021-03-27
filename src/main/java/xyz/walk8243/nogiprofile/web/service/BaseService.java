package xyz.walk8243.nogiprofile.web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public abstract class BaseService {
	public static final String BASE_URL = "http://api:8080";
	// public static final String BASE_URL = "http://localhost:46468";

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
