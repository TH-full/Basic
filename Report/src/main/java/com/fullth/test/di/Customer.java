package com.fullth.test.di;

public class Customer {
	public Logistics order;

	public Customer(Logistics order) {
		this.order = order;
	}
	
	public void showRoll() {
		order.LogisticsType();
	}
}
