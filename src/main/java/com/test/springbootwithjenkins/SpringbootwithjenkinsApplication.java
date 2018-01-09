package com.test.springbootwithjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.test.springbootwithjenkins.controller.SimapleController;

@SpringBootApplication
public class SpringbootwithjenkinsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimapleController.class, args);
	}
}
