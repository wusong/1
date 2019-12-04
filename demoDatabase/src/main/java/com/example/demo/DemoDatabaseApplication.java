package com.example.demo;


import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

@SpringBootApplication
public class DemoDatabaseApplication implements CommandLineRunner, ApplicationContextAware {

	ApplicationContext applicationContext;
	@Autowired
	DataSource dataSource;
	@Autowired
	SqlSessionFactory sqlSessionFactory;

	public static void main(String[] args) {
		SpringApplication.run(DemoDatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("222222222222222222222222");
		String applicationId = applicationContext.getId();
		System.out.println(applicationId);
		String driverName = dataSource.getConnection().getMetaData().getDriverName();
		System.out.println(driverName);
		System.out.println(sqlSessionFactory.toString());
		while (true) {

		}
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;

	}

}
