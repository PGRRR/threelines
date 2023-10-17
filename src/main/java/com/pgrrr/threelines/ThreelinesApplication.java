package com.pgrrr.threelines;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ThreelinesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreelinesApplication.class, args);
	}

}
