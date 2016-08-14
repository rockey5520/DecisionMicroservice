package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	
	@RequestMapping("/")
	public String hello(){
		return "Finally saying hello from inside";
	}

}
