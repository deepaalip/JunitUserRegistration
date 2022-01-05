package com.bridgelabz.regexjunittest;

import java.util.regex.Pattern;

public class UserRegistration {
	private static final String FirstNameRegex= "^[A-Z][a-z]{2,}";
	private static final String LastNameRegex= "^[A-Z][a-z]{2,}";
	private static final String EmailRegex = "^[A-Za-z0-9_-]+([.][A-Za-z0-9_-]+)@[A-Za-z]+[A-Za-z]+([.][A-Za-z]+)";
	private static final String PhoneNoRegex = "^[0-9]{2}[0-9]{10}";
	private static final String PasswordRegex="^(?=.*[a-z])(?=."+ "*[A-Z])(?=.*[0-9])"+ "(?=.*[-+_!@#$%^&*., ?]).+$";
	
	public  boolean userFirstName(String firstName) {

		return Pattern.matches(FirstNameRegex, firstName);	
    
   }
	
	public  boolean userLastName(String lastName) {

		return Pattern.matches(LastNameRegex, lastName);		

	}

	public boolean userEmail(String email) {
		
		return Pattern.matches(EmailRegex, email);
	}
		
    public boolean userPhoneNo(String phone) {
		
		return Pattern.matches(PhoneNoRegex, phone);
	}
		
    public boolean userPassword(String password) {
		
		return Pattern.matches(PasswordRegex, password);
	}
}
