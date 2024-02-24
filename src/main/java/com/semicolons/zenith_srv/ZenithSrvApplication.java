package com.semicolons.zenith_srv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ZenithSrvApplication {

	public static void main(String[] args) {
		System.out.println("Starting 'ZenithSrv - Backend', Please wait ...");
		SpringApplication.run(ZenithSrvApplication.class, args);
		System.out.println("Started 'ZenithSrv - Backend', Receiving requests ...");
	}

}
