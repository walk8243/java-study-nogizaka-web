package xyz.walk8243.nogiprofile.web;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
	@Getter @Setter private String name = "nogiprofile-web";
	@Getter @Setter private String env;
	@Getter private final Backend backend = new Backend();

	public static class Backend {
		@Getter @Setter private String url = "http://localhost:8000";
	}
}
