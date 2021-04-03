package xyz.walk8243.nogiprofile.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xyz.walk8243.nogiprofile.web.AppProperties;

@Service
public class IndexService extends BaseService {
	@Autowired
	AppProperties appProperties;

	public String getResponse() {
		return appProperties.getName() + ", " + appProperties.getBackend().getUrl();
	}
}
