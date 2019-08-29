package com.example.zhtSpringCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ZhtSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhtSpringCloudConfigServerApplication.class, args);
	}
}
