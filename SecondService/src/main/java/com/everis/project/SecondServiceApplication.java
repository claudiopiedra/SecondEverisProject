package com.everis.project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SecondServiceApplication {

	private static Logger logger = LoggerFactory.getLogger(SecondServiceApplication.class); 

	public static void main(String[] args) {
		SpringApplication.run(SecondServiceApplication.class, args);
	}

}
