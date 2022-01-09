package com.bridgelabz.regexjunittest;





import org.junit.Assert;
import org.junit.Test;



public class JunitTestRegex {

	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws FirstNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Deepali");
	    Assert.assertTrue( isValid);
	}
  
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() throws FirstNameException {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.validateFirstName("deepali");
 	    Assert.assertFalse(isValid);
 	    
 	}
  @Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() throws FirstNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() throws FirstNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("de");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() throws FirstNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Dee67");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() throws FirstNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Deep#");
		Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Patil");
		Assert.assertTrue( isValid);
	}
  
@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("patil");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("pa");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Pa35");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() throws LastNameException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Pat#il");
		Assert.assertFalse(isValid);
	    
	}

@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() throws EmailException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateEmail("abc@gmail.com");
	    Assert.assertTrue(isValid);
	}

@Test
public void givenEmail_WhenEmailWithoutSpecialChar_ShouldReturnFalse() throws EmailException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("abcgmail.com");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmailWithoutDotNotation_ShouldReturnFalse() throws EmailException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("abc@gmailcom");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmptyString_ShouldReturnFalse() throws EmailException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenShort_ShouldReturnFalse() throws EmailException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("pa");
	Assert.assertFalse(isValid);
    
}

@Test
public void givenPhoneNo_WhenProper_ShouldReturnTrue() throws PhoneNumberException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePhoneNumber("917856342311");
    Assert.assertTrue( isValid);
}

@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() throws PhoneNumberException {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhoneNumber("91343656");
	    Assert.assertFalse(isValid);
	    
	}
@Test
public void givenPassword_WhenOneNumericValue_ShouldReturnTrue() throws PhoneNumberException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePhoneNumber("passWord@123");
    Assert.assertTrue( isValid);
}

@Test
public void givenPassword_WhenShort_ShouldReturnFalse() throws PasswordException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePassword("pass@3");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() throws PasswordException {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePassword("Paassword");
	Assert.assertFalse(isValid);
    
}

}
