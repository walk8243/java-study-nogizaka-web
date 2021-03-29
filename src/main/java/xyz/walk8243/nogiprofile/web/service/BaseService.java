package xyz.walk8243.nogiprofile.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import xyz.walk8243.nogiprofile.web.AppProperties;

@Service
public abstract class BaseService {
	@Autowired
	RestTemplate restTemplate;

	@Autowired
	AppProperties appProperties;

	public String getBaseUrl() {
		return appProperties.getBackend().getUrl();
	}
}
