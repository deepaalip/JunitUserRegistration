package com.bridgelabz.regexjunittest;





import org.junit.Assert;
import org.junit.Test;



public class JunitTestRegex {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.firstNameValidation.validateFirstName("Deepali");
	    Assert.assertTrue( isValid);
	}
  
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() throws UserValidationException {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.firstNameValidation.validateFirstName("deepali");
 	    Assert.assertFalse(isValid);
 	    
 	}
  @Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.firstNameValidation.validateFirstName("");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.firstNameValidation.validateFirstName("de");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.firstNameValidation.validateFirstName("Dee67");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.firstNameValidation.validateFirstName("Deep#");
		Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("Patil");
		Assert.assertTrue( isValid);
	}
  
@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("patil");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("pa");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("Pa35");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.lastNameValidation.validateLastName("Pat#il");
		Assert.assertFalse(isValid);
	    
	}

@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.emailValidation.validateEmail("abc@gmail.com");
	    Assert.assertTrue(isValid);
	}

@Test
public void givenEmail_WhenEmailWithoutSpecialChar_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.emailValidation.validateEmail("abcgmail.com");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmailWithoutDotNotation_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.emailValidation.validateEmail("abc@gmailcom");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmptyString_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.emailValidation.validateEmail("");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenShort_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.emailValidation.validateEmail("pa");
	Assert.assertFalse(isValid);
    
}

@Test
public void givenPhoneNo_WhenProper_ShouldReturnTrue() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.phoneNumberValidation.validatePhoneNumber("917856342311");
    Assert.assertTrue( isValid);
}

@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() throws UserValidationException{
		UserRegistration user = new UserRegistration();
		boolean isValid = user.phoneNumberValidation.validatePhoneNumber("91343656");
	    Assert.assertFalse(isValid);
	    
	}
@Test
public void givenPassword_WhenOneNumericValue_ShouldReturnTrue() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.phoneNumberValidation.validatePhoneNumber("passWord@123");
    Assert.assertTrue( isValid);
}

@Test
public void givenPassword_WhenShort_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.passwordValidation.validatePassword("pass@3");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() throws UserValidationException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.passwordValidation.validatePassword("Paassword");
	Assert.assertFalse(isValid);
    
}

}
