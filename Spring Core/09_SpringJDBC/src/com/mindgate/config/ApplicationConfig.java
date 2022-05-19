package com.mindgate.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.mindgate")
@PropertySource("classpath:dbconnection.properties")
public class ApplicationConfig {
	@Autowired
	Environment environment;

	@Bean
	DataSource dataSource() {

		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty("url"));
		driverManagerDataSource.setUsername(environment.getProperty("username"));
		driverManagerDataSource.setPassword(environment.getProperty("password"));
		driverManagerDataSource.setDriverClassName(environment.getProperty("driver"));

		return driverManagerDataSource;
	}
}
