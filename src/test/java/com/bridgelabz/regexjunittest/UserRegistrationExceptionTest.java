package com.bridgelabz.regexjunittest;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationExceptionTest {
	@Test
	public void givenFirstName_IsNull_ShouldThrowNullException() throws UserValidationException {
		UserRegistration register = new UserRegistration();
		try {
			register.firstNameValidation.validateFirstName(null);
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.Null, e.type);
		}
	}
	@Test
	public void givenFirstName_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

		UserRegistration register = new UserRegistration();
		try {
			register.firstNameValidation.validateFirstName("");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.EmptyString, e.type);
		}
	}
	@Test
	public void givenLastName_IsNull_ShouldThrowNullException() throws UserValidationException {
		UserRegistration register = new UserRegistration();
		try {
			register.lastNameValidation.validateLastName(null);
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.Null, e.type);
		}
	}
	@Test
	public void givenLastName_WhenEmpty_ShouldThrowEmptyException1() throws UserValidationException{

		UserRegistration register = new UserRegistration();
		try {
			register.lastNameValidation.validateLastName("");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.EmptyString, e.type);
		}
	}
	@Test
	public void givenEmail_IsNull_ShouldThrowNullException() throws UserValidationException {
		UserRegistration register = new UserRegistration();
		try {
			register.emailValidation.validateEmail(null);
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.Null, e.type);
		}
	}
	@Test
	public void givenEmail_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

		UserRegistration register = new UserRegistration();
		try {
			register.emailValidation.validateEmail("");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.EmptyString, e.type);
		}
	}
	@Test
	public void givenPhoneNumber_IsNull_ShouldThrowNullException() throws UserValidationException {
		UserRegistration register = new UserRegistration();
		try {
			register.phoneNumberValidation.validatePhoneNumber(null);
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.Null, e.type);
		}
	}
	@Test
	public void givenPhoneNumber_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

		UserRegistration register = new UserRegistration();
		try {
			register.phoneNumberValidation.validatePhoneNumber("");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.EmptyString, e.type);
		}
	}
	@Test
	public void givenPassword_IsNull_ShouldThrowNullException() throws UserValidationException {
		UserRegistration register = new UserRegistration();
		try {
			register.passwordValidation .validatePassword(null);
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.Null, e.type);
		}
	}
	@Test
	public void givenPassword_WhenEmpty_ShouldThrowEmptyException() throws UserValidationException{

		UserRegistration register = new UserRegistration();
		try {
			register.passwordValidation .validatePassword("");
		} catch (UserValidationException e) {
			Assert.assertEquals(UserValidationException.ExceptionType.EmptyString, e.type);
		}
	}

}
