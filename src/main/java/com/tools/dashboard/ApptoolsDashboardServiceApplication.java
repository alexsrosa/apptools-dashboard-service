package com.tools.dashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ApptoolsDashboardServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApptoolsDashboardServiceApplication.class, args);
	}
}
