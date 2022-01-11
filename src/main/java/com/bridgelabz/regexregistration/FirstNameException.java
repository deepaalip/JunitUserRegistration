package com.bridgelabz.regexregistration;



public class FirstNameException extends Exception{
	public ExceptionType type;
	public String message;
	public enum ExceptionType{
		Null,EmptyString
	}

  public FirstNameException(ExceptionType type,String message) {
	  super();
	  this.type = type;	
  }
}
