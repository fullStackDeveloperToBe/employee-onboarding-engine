package com.employee.onboarding.engine.scheduler;

//import org.apache.logging.log4j.core.config.Scheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.employee.onboarding.engine.utility.Logging;

@Configuration
@EnableScheduling
//(cron = "0 0 0 * * ?") every day at midnight
public class Schedule {
	
	@Autowired
	Logging logUtil;
	
	int i = 1;
	
	@Bean
	public void getSchedule() {
	logUtil.logInfo("This is Scheduling using @Bean annotation");
	System.out.println("CURRENT TIME Fixed rate task - " + System.currentTimeMillis() / 1000);
	}
	
	
	//@Scheduled(cron = "* * 23 * * ?")
	public void execute() 
	{
		logUtil.logInfo("This is Scheduling "+ i++);
	}
	
}
