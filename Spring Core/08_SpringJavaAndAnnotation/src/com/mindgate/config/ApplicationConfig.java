package com.mindgate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;

@Configuration
@ComponentScan("com.mindagte.pojo")
public class ApplicationConfig {

	@Bean
	public FinancialYearDetails financialYearDetails() {
		return new FinancialYearDetails();
		
	}
	@Bean
	public MonthDetails monthDetails() {
		FinancialYearDetails financialYearDetails= new FinancialYearDetails();
		
		MonthDetails monthDetails= new MonthDetails();
		monthDetails.setFinancialYearDetails(financialYearDetails);
		return monthDetails ;
		
	}
}
