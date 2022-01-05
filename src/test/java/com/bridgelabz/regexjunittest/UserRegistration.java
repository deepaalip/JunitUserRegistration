package com.bridgelabz.regexjunittest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstNameRegex= "^[A-Z][a-z]{2,}";
	private static final String LastNameRegex= "^[A-Z][a-z]{2,}";
	private static final String EmailRegex = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)";
	
	public  boolean userFirstName(String firstName) {

		return Pattern.matches(FirstNameRegex, firstName);	
    
   }
	
	public  boolean userLastName(String lastName) {

		return Pattern.matches(LastNameRegex, lastName);		

	}

	public boolean userEmail(String email) {
		
		return Pattern.matches(EmailRegex, email);
	}
		
	
	
}
