package com.mindgate.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("monthDetails")
@Scope("prototype")
public class MonthDetails {
 private int monthId;
 private LocalDate monthStaryDate;
 private LocalDate monthEnddate;
@Autowired
 private FinancialYearDetails financialYearDetails;
 
 public MonthDetails() {
	// TODO Auto-generated constructor stub
}

public MonthDetails(int monthId, LocalDate monthStaryDate, LocalDate monthEnddate,
		FinancialYearDetails financialYearDetails) {
	super();
	this.monthId = monthId;
	this.monthStaryDate = monthStaryDate;
	this.monthEnddate = monthEnddate;
	this.financialYearDetails = financialYearDetails;
}

public int getMonthId() {
	return monthId;
}

public void setMonthId(int monthId) {
	this.monthId = monthId;
}

public LocalDate getMonthStaryDate() {
	return monthStaryDate;
}

public void setMonthStaryDate(LocalDate monthStaryDate) {
	this.monthStaryDate = monthStaryDate;
}

public LocalDate getMonthEnddate() {
	return monthEnddate;
}

public void setMonthEnddate(LocalDate monthEnddate) {
	this.monthEnddate = monthEnddate;
}

public FinancialYearDetails getFinancialYearDetails() {
	return financialYearDetails;
}

public void setFinancialYearDetails(FinancialYearDetails financialYearDetails) {
	this.financialYearDetails = financialYearDetails;
}

@Override
public String toString() {
	return "MonthDetails [monthId=" + monthId + ", monthStaryDate=" + monthStaryDate + ", monthEnddate=" + monthEnddate
			+ ", financialYearDetails=" + financialYearDetails + "]";
} 
 
}
