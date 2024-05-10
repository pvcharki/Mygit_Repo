package com.springboot.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo1Application {

	@GetMapping("/")
	public String getMessage()
	{
		return "Hurray!! Openshift Deplyment is Successful";
		
	}
	
	@PostMapping("/{name}")
	public String putMessage(@PathVariable String name)
	{
		return "Name is :"+name;
		
	}
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}

}
