package com.bridgelabz.regexregistration;

import java.util.regex.Pattern;

import com.bridgelabz.regexregistration.UserValidationException.ExceptionType;


public class UserRegistration {
	private static final String FIRST_NAME_REGEX = "^[A-Z][a-z]{2,}";
	private static final String LAST_NAME_REGEX = "^[A-Z][a-z]{2,}$";
	private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+-]+(?:\\.[a-zA-Z0-9_+-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]{2,})*(?![a-zA-Z0-9.]+)*$";
	private static final String PHONE_NUMBER_REGEX = "^[0-9]{2}[0-9]{10}";
	private static final String PASSWORD_REGEX = "(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*()_-])[a-zA-Z0-9].{8,}$";
	static boolean isFirstNameValid,isLastNameValid,isMailValid,isNumberValid,isPasswordValid,isMoodValid;
	
	public ValidateFirstName firstNameValidation = (String firstName)->{
		try {
		isFirstNameValid= Pattern.matches(FIRST_NAME_REGEX,firstName);
		if(!isFirstNameValid) {
			System.out.println("First Name is invalid...Please enter proper first name");
		}
		if(firstName.length() == 0) {
			throw new UserValidationException(ExceptionType.EmptyString, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.Null, "Enter Proper Message. NULL Not Allowed");
		}
		return isFirstNameValid;
	};
	public ValidateLastName lastNameValidation = (String lastName)->{
		try {
		isLastNameValid= Pattern.matches(LAST_NAME_REGEX, lastName);
		if(!isLastNameValid) {
			System.out.println("Last Name is invalid...Please enter proper last name");
		}
		if(lastName.length() == 0) {
			throw new UserValidationException(ExceptionType.EmptyString, "Enter Proper Message. EMPTY Not Allowed");

		}
		}
		catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.Null, "Enter Proper Message. NULL Not Allowed");
		}
		return isLastNameValid;
	};
	public ValidateEmail emailValidation = (String mail )-> {
		try {
		isMailValid= Pattern.matches(EMAIL_REGEX, mail);
		if(!isMailValid) {
			System.out.println("E-mail is invalid...Please enter e-mail");
		}
		if(mail.length() == 0) {
			throw new UserValidationException(ExceptionType.EmptyString, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.Null, "Enter Proper Message. NULL Not Allowed");
		}
		return isMailValid;
	};
	public ValidatePhoneNumber phoneNumberValidation = (String number)-> {
		try {
		boolean isNumberValid= Pattern.matches(PHONE_NUMBER_REGEX, number);
		if(!isNumberValid) {
			System.out.println("Phone Number is invalid...Please enter proper phone-number");
		}
		if(number.length() == 0) {
			throw new UserValidationException(ExceptionType.EmptyString, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.Null, "Enter Proper Message. NULL Not Allowed");
		}
		return isNumberValid;
};
	public ValidatePassword passwordValidation = (String password)-> {
		try {
		isPasswordValid= Pattern.matches(PASSWORD_REGEX, password);
		if(!isPasswordValid) {
			System.out.println("Password is invalid...Please enter proper password");
		}
		if(password.length() == 0) {
			throw new UserValidationException(ExceptionType.EmptyString, "Enter Proper Message. EMPTY Not Allowed");
		}
		}
		catch (NullPointerException e) {
			throw new UserValidationException(ExceptionType.Null, "Enter Proper Message. NULL Not Allowed");
		}
		return isPasswordValid;
	};
}
