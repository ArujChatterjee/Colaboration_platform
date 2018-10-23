package com.niit.model;

public class ErrorClazz {
	private int errorCode;
	public int getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	private String message;
	
public ErrorClazz(int errorCode, String message)
{
	super();
	this.errorCode =errorCode;
	this.message=message;
}
public ErrorClazz(String message)
{
	super();
	this.message=message;
}
}
