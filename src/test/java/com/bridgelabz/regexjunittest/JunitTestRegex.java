package com.bridgelabz.regexjunittest;


import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestRegex {
  @Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Deepali");
	    assertTrue( isValid);
	}
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.userFirstName("deepali");
 	    Assert.assertFalse(null,isValid);
 	    
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
}
