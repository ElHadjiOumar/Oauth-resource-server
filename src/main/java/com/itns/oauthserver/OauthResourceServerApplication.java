package com.itns.oauthserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * > This class is a Spring Boot application that is also an OAuth2 Resource Server
 */
@SpringBootApplication
public class OauthResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OauthResourceServerApplication.class, args);
	}

}
