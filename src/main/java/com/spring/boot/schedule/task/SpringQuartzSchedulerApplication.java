package com.spring.boot.schedule.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringQuartzSchedulerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringQuartzSchedulerApplication.class, args);
	}
}
