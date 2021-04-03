package com.tfi.vp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages="com.tfi")
public class VolunteeringPortal {

	public static void main(String[] args) {
		SpringApplication.run(VolunteeringPortal.class, args);
	}

}

