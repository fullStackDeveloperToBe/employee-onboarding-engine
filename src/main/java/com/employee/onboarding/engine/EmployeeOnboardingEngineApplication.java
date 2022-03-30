package com.employee.onboarding.engine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.employee.onboarding.engine.utility.Logging;

@SpringBootApplication
public class EmployeeOnboardingEngineApplication implements CommandLineRunner {
	
	@Autowired
	Logging logUtil;

	public static void main(String[] args) {
		SpringApplication.run(EmployeeOnboardingEngineApplication.class, args);
	}
	
	@Override
    public void run(String... args) {
        logUtil.logInfo("EXECUTING : command line runner");

}
}

