package com.dev.magne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;

import com.dev.magne.*;

@SpringBootApplication(scanBasePackages= {"com.dev.magne"})
public class LokaytorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LokaytorApplication.class, args);
	}
	
	@Bean
	
}
