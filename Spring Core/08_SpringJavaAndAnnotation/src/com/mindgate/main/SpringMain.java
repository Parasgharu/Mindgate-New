package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYearDetails;
import com.mindgate.pojo.MonthDetails;

public class SpringMain {

	public static void main(String[] args) {

		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		FinancialYearDetails financialYearDetails = applicationContext.getBean("financialYearDetails",
				FinancialYearDetails.class);
		financialYearDetails.setYearStartDate(LocalDate.of(2022, 04, 01));
		financialYearDetails.setYearEndDate(LocalDate.of(2023, 03, 31));
		financialYearDetails.setYearId(1);
		System.out.println(financialYearDetails);

		MonthDetails monthDetails = applicationContext.getBean("monthDetails", MonthDetails.class);
		monthDetails.setMonthId(01);
		monthDetails.setMonthStaryDate(LocalDate.of(2022, 05, 01));
		monthDetails.setMonthEnddate(LocalDate.of(2022, 05, 31));
		monthDetails.setFinancialYearDetails(financialYearDetails);
		System.out.println(monthDetails);

	}

}
