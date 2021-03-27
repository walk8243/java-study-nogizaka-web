package xyz.walk8243.nogiprofile.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndexService extends BaseService {
	@Autowired
	RestTemplate restTemplate;

	public static final String BASE_PATH = "/";

	public String getResponse() {
		return restTemplate.getForObject(BASE_URL + BASE_PATH, String.class);
	}
}
