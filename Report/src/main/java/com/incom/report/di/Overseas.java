package com.incom.report.di;

public class Overseas implements Logistics{
	
	String companyName;
	public void setCompanyName(String companyName) {
		this.companyName=companyName;
	}
	
	@Override
	public void LogisticsType() {
		System.out.println("해외배송 담당: " + companyName);		
	}

}
