package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.system.ApplicationPidFileWriter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient // or @EnableDiscoveryClient
public class EurekaClientApplication {

	public static void main(String[] args) {
		//SpringApplication.run(EurekaClientApplication.class, args);
		SpringApplication notificationMicorService=new SpringApplication(EurekaClientApplication.class);
		notificationMicorService.addListeners(new ApplicationPidFileWriter("notification-micor-service.pid"));
		notificationMicorService.run(args);
	}
}
