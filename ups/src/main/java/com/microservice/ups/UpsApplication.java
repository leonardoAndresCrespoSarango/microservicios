package com.microservice.ups;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
@SpringBootApplication

public class UpsApplication {

	//public static void main(String[] args) {
		//SpringApplication.run(UpsApplication.class, args);
	//}
	@GetMapping("/weatherForecast")
	public String getMessage(){
		return "Today is a great sunny day for a java service";
	}
	public static void main(String[] args) {
		SpringApplication.run(UpsApplication.class, args);
	}

}
