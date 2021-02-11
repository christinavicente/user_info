package com.example.phase3week1;

import com.example.phase3week1.controller.UserController;
import com.example.phase3week1.model.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Phase3week1Application {
	private static final Logger log = LoggerFactory.getLogger(Phase3week1Application.class);
	public static void main(String[] args) {
		UserDAO userDAO=new UserDAO();
		userDAO.initDatabase();

		SpringApplication.run(Phase3week1Application.class, args);
	}

}
