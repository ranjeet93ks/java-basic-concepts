package com.interviews.questions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class JavaBasicConceptApplication {
	private static final Logger logger = LoggerFactory.getLogger(JavaBasicConceptApplication.class);

	public static void main(String[] args) {
		logger.info("PrevProjLrngApplication -> main() --> started ");
		SpringApplication.run(JavaBasicConceptApplication.class, args);
	}

}
