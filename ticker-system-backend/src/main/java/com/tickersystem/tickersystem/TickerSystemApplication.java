package com.tickersystem.tickersystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TickerSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TickerSystemApplication.class, args);
	}

}
