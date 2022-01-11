package com.bridgelabz.regexregistration;



public class PasswordException extends Exception{
	public ExceptionType4 type;
	public String message;
	public enum ExceptionType4{
		Null,EmptyString
	}
public PasswordException(ExceptionType4 type,String message){
	super();
	this.type = type;	
	
}
}
