package com.example.dbdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DbdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(DbdemoApplication.class, args);
		System.out.println("Main Page");
		System.out.println("this is a develop branch");
		System.out.println("this is a 3rd commit");
	}

}
