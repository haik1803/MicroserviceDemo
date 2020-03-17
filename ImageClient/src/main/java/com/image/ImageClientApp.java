package com.image;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImageClientApp {

	public static void main(String[] args) {
		SpringApplication.run(ImageClientApp.class, args);

	}

}
