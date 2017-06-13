package com.design.pattern;

public class Customer implements Observer {

	private String cusName;
	private Subject subject;

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public void update(String productName) {
		System.out.println("Hi "+ cusName +"Product "+ productName +"is now available ");
	}

}
