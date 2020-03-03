package com.mockup.microserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaConfigServerApplication.class, args);
	}

}
