package com.bridgelabz.regexregistration;



public class LastNameException extends Exception{
	 ExceptionType1 type;
	public String message;
	 enum ExceptionType1{
		Null,EmptyString
	}

  public LastNameException(ExceptionType1 type,String message) {
	  super();
	  this.type = type;	
  }

}
