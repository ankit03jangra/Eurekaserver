package com.jangra.library.libraryeurekanamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class LibraryEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryEurekaNamingServerApplication.class, args);
	}

}
