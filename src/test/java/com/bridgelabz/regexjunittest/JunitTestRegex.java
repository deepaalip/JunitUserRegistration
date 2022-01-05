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
	    assertTrue( isValid);
	}
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.userFirstName("deepali");
 	    assertFalse(null,isValid);
 	    
 	}
  @Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("");
	    assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("de");
	    assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Dee67");
	    assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Deep#");
	    assertFalse(isValid);
	    
	}
  @Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Patil");
	    assertTrue( isValid);
	}
@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("patil");
	    assertFalse(null,isValid);
	    
	}
@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("");
	    assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("pa");
	    assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Pa35");
	    assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userFirstName("Pat#il");
	    assertFalse(isValid);
	    
	}
}
