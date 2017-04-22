package com.spring.boot.schedule.task.service;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AutoJobRunner {
	@Scheduled(fixedRate = 5000)
	public void displayTime1() {
		System.out
				.println("Current date&Time using (fixedRate and fixedDelay) :"
						+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a")
								.format(new Date()));
	}

	@Scheduled(cron = "*/5 * * * * ?")
	public void displayTime2() {
		System.out.println("Current date&Time using cron Expression :"
				+ new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a")
						.format(new Date()));
	}
}
