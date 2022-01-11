package com.bridgelabz.regexregistration;



public class EmailException extends Exception{
	public ExceptionType2 type;
	public String message;
	public enum ExceptionType2{
		Null,EmptyString
	}
public EmailException(ExceptionType2 type,String message){
	super();
	this.type = type;	
	
}
}
