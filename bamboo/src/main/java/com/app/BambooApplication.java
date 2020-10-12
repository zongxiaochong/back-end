package com.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.app.dao.*")
public class BambooApplication {

	public static void main(String[] args) {
		SpringApplication.run(BambooApplication.class, args);
	}

}
