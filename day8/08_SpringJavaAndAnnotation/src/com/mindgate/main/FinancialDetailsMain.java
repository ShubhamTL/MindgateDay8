package com.mindgate.main;

import java.time.LocalDate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.mindgate.config.ApplicationConfig;
import com.mindgate.pojo.FinancialYeardetails;
import com.mindgate.pojo.MonthsDetails;

public class FinancialDetailsMain {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		FinancialYeardetails financialYeardetails = applicationContext.getBean("financialYear", FinancialYeardetails.class);
		financialYeardetails.setYearId(21);
		financialYeardetails.setYearStartDate(LocalDate.of(2021, 04, 01));
		financialYeardetails.setYearEndDate(LocalDate.of(2022, 03, 31));
		System.out.println(financialYeardetails);
		
		MonthsDetails monthsDetails = applicationContext.getBean("monthDetail", MonthsDetails.class);
		monthsDetails.setMonthId(7);
		monthsDetails.setMonthStartDate(LocalDate.of(2021, 07, 01));
		monthsDetails.setMonthEndDate(LocalDate.of(2021, 07, 31));
		System.out.println(monthsDetails);
	}
}
