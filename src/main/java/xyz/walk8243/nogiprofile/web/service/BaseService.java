package xyz.walk8243.nogiprofile.web.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public abstract class BaseService {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
