package com.bridgelabz.regexjunittest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstName= "^[A-Z][a-z]{2,}";
	private static final String LastName= "^[A-Z][a-z]{2,}";
	
	public  boolean userFirstName(String firstName) {

		
		Pattern pattern =Pattern.compile(FirstName);
		Matcher matcher = pattern.matcher(firstName);
	
	    System.out.println(matcher.matches());
		return true;		
    
   }
	
	public static  boolean userLastName(String lastName) {

		Pattern pattern =Pattern.compile(LastName);
		Matcher matcher = pattern.matcher(lastName);
	
	    System.out.println(matcher.matches());
		return true;		

	}

	
	
	
}
