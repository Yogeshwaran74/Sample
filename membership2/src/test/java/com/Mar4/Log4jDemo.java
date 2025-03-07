package com.Mar4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo {
	public static Logger log;
	
	public static void main(String[] args) {
		
		log=LogManager.getLogger(Log4jDemo.class);
		
		log.debug("this is a debug msg");
		log.fatal("this is a fatal msg");
		log.error("this is a error msg");
		log.info("this is a info msg");
		log.warn("this is a warn msg");

		System.out.println("prg started");
		System.out.println("unm entered");
		System.out.println("pwd entered");
		System.out.println("log clicked");
		System.out.println("login done");

	}

}
