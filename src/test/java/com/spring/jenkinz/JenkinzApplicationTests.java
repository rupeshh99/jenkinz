package com.spring.jenkinz;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinzApplicationTests {

	static Logger logger= LoggerFactory.getLogger(JenkinzApplication.class);


	@Test
	void contextLoads() {
		logger.info("test case executing");
		logger.info("3 commit is on the way");
		logger.info("now build pipeline is added");
	}

}
