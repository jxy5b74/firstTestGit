package com.logit;

import org.apache.log4j.Logger;

public class Test01 {
	/**
	* Logger for this class
	*/
	private static final Logger logger = Logger.getLogger(Test01.class);
	
	
	public static void main(String[] args) {
		logger.debug("=====>DEBUG");
		logger.info("=====>INFO");
		logger.warn("=====>WARN");
		logger.error("=====>ERROR");
		
		
	}
	
	
}
