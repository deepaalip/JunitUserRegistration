package com.bridgelabz.regexjunittest;



public class PhoneNumberException extends Exception{
	public ExceptionType3 type;
	public String message;
	public enum ExceptionType3{
		Null,EmptyString
	}
public PhoneNumberException(ExceptionType3 type,String message){
	super();
	this.type = type;	
	
}
}
