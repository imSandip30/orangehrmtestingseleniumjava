package com.CarnationTestingShastra24KDD.errors;

public class InvalidBrowserError extends Error {

	private String browserName;
	
	public InvalidBrowserError(String browserName) {
		this.browserName = browserName;
	}

	@Override
	public String getMessage() {
		return "Invalid Browser Name : "+this.browserName;
	}

}
