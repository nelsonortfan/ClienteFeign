package com.example.feign.feigntest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeigntestApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeigntestApplication.class, args);
	}

}
