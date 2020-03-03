package com.incom.report.di;

public class Local implements Logistics{

	String companyName;
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	@Override
	public void LogisticsType() {
		System.out.println("국내배송 담당: " + companyName);		
	}

}
