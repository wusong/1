package com.example.demo.hello;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Component
@RestController
public class HelloController {
	@RequestMapping("/hello")
	public String helloWorld() {
		return "hello world";
	}

}
