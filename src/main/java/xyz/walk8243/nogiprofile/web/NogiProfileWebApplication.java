package xyz.walk8243.nogiprofile.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching(proxyTargetClass = true)
public class NogiProfileWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(NogiProfileWebApplication.class, args);
	}

}
