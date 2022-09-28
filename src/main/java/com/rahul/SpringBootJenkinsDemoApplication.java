package com.rahul;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController
public class SpringBootJenkinsDemoApplication {
	public static Logger logger= LoggerFactory.getLogger(SpringBootJenkinsDemoApplication.class);
	public void init(){
		logger.info("Application started.....");
	}

//	@GetMapping("/greet")
//	public String greetController(){
//		return "Hi, Greet controller is working.";
//	}

	public static void main(String[] args) {
		logger.info("Application executed");

		SpringApplication.run(SpringBootJenkinsDemoApplication.class, args);
	}

}
