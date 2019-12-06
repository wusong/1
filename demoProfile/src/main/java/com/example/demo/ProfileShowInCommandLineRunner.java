package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileShowInCommandLineRunner implements CommandLineRunner{
	
	Logger logger = LoggerFactory.getLogger(ProfileShowInCommandLineRunner.class);
	
	@Value(value = "${name}")
	String name;

	@Value("${prop}")
	String prop;
	
	@Autowired
	Config config;
	
	@Override
	public void run(String... args) throws Exception {
		logger.info("<<<<>>>>>");
		logger.info(name);
		logger.info(prop);
		logger.info(config.getServers().get(0));
	}

}
