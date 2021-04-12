package xyz.walk8243.nogiprofile.web.configuration;

import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ch.qos.logback.access.tomcat.LogbackValve;

@Configuration
public class TomcatLoggingConfig {
	@Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcatServletWebServerFactory = new TomcatServletWebServerFactory();
		LogbackValve logbackValve = new LogbackValve();
		logbackValve.setFilename("logback-access.xml");
        tomcatServletWebServerFactory.addContextValves(logbackValve);
        return tomcatServletWebServerFactory;
    }
}
