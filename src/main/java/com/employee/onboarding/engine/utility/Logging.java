package com.employee.onboarding.engine.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("logUtil")
public class Logging {
	
	private static final Logger logger = LoggerFactory.getLogger(Logging.class);
	public void logInfo(String message)
	{
		logger.info(message);
	}
	
	public void logDebug(String message)
	{
		logger.debug(message);
	}
	
}
