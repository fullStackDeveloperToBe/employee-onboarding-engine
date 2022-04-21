package com.employee.onboarding.engine.scheduler;

import org.apache.logging.log4j.core.config.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.employee.onboarding.engine.utility.Logging;

@Configuration
@EnableScheduling
//@Scheduled(cron = "0 0 0 * * ?") every day at midnight
public class Schedule {
	
	@Autowired
	Logging logUtil;
	
	@Bean
	public void getSchedule() {
	logUtil.logInfo("This is Scheduling");
	System.out.println("Fixed rate task - " + System.currentTimeMillis() / 1000);
	}
	
}
