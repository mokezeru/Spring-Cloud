package com.charter.eurekaAdminServer;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
@EnableAdminServer
public class EurekaAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaAdminServerApplication.class, args);
	}

}
