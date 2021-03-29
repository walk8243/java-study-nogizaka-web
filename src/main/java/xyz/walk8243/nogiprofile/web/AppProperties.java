package xyz.walk8243.nogiprofile.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
	private String name = "nogiprofile-web";
	private final Backend backend = new Backend();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Backend getBackend() {
		return backend;
	}

	public static class Backend {
		private String url = "http://localhost:8000";

		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
	}
}
