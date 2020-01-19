package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoNettyApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoNettyApplication.class, args);
		System.out.print(1);
		System.out.print(1);
		System.gc();
		System.out.print(1);
		System.out.print(1);
		System.out.print(1);
		System.out.print(1);
		System.out.print(1);
		System.out.print(1);
	}

}
