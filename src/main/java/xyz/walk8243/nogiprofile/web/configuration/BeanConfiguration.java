package xyz.walk8243.nogiprofile.web.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import xyz.walk8243.nogiprofile.web.AppProperties;

@Configuration
@EnableConfigurationProperties(AppProperties.class)
public class BeanConfiguration {
	@Bean
	RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
