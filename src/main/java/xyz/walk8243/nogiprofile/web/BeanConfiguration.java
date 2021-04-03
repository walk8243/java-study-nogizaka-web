package xyz.walk8243.nogiprofile.web;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@EnableConfigurationProperties(AppProperties.class)
public class BeanConfiguration {
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
