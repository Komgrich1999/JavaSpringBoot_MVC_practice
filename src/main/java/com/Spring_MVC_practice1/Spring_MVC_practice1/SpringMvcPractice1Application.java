package com.Spring_MVC_practice1.Spring_MVC_practice1;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication //(exclude = {DataSourceAutoConfiguration.class})
public class SpringMvcPractice1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcPractice1Application.class, args);
	}
}
