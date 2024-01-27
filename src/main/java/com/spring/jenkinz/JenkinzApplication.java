package com.spring.jenkinz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class JenkinzApplication {

	static Logger logger= LoggerFactory.getLogger(JenkinzApplication.class);

	@PostConstruct
	public void start(){
		logger.info("application has been started");
	}
	public static void main(String[] args) {
		logger.info("application has been executed");
		logger.info("2 logger added here");
		SpringApplication.run(JenkinzApplication.class, args);
	}

}
