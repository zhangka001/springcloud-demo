package com.zrb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurekaServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudEurekaServerDemoApplication.class, args);
	}
}
