package com.example.demogit;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping
	public String getMethodName(@RequestParam String param) {
		
		return "안녕하세요";
	}
}
