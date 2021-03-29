package xyz.walk8243.nogiprofile.web.service;

import org.springframework.stereotype.Service;

@Service
public class IndexService extends BaseService {
	public final String BASE_PATH = "/";

	public String getResponse() {
		// return restTemplate.getForObject(BASE_URL + BASE_PATH, String.class);
		return appProperties.getName() + ", " + getBaseUrl();
	}
}
