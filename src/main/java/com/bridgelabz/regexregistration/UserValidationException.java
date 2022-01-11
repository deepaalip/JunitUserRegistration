package com.bridgelabz.regexregistration;

public class UserValidationException extends Exception{
		
		enum ExceptionType {
			Null, EmptyString
		}

		ExceptionType type;

		public UserValidationException(ExceptionType type, String message) {

			super(message);
			this.type = type;
			
		}

		
}
