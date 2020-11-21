package com.in28minutes.rest.webservices.resfulwebservices.helloworld;

public class HelloWorldBean {
	private String message;

	public HelloWorldBean(String message) {
		super();
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	} 

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
