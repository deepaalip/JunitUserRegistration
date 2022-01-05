package com.bridgelabz.regexjunittest;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestRegex {
  @Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Deepali");
	    Assert.assertTrue( isValid);
	}
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.userFirstName("deepali");
 	    Assert.assertFalse(isValid);
 	    
 	}
  @Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("de");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Dee67");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Deep#");
		Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("Patil");
		Assert.assertTrue( isValid);
	}
@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("patil");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("pa");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("Pa35");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userLastName("Pat#il");
		Assert.assertFalse(isValid);
	    
	}

@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userEmail("abc@gmail.com");
	    Assert.assertTrue(isValid);
	}
@Test
public void givenEmail_WhenEmailWithoutSpecialChar_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userEmail("abcgmail.com");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmailWithoutDotNotation_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userEmail("abc@gmailcom");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmptyString_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userEmail("");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenShort_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userEmail("pa");
	Assert.assertFalse(isValid);
    
}

@Test
public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userPhoneNo("917856342311");
    Assert.assertTrue( isValid);
}
@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPhoneNo("91343656");
	    Assert.assertFalse(isValid);
	    
	}
public void givenPassword_WhenProper_ShouldReturnTrue() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userPassword("Password@123");
    Assert.assertTrue( isValid);
}
@Test
public void givenPassword_WhenShort_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.userPassword("Pa@34");
	Assert.assertFalse(isValid);
    
}

}
