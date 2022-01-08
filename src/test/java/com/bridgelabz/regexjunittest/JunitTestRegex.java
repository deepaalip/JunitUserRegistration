package com.bridgelabz.regexjunittest;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

public class JunitTestRegex {
  @Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Deepali");
	    Assert.assertTrue( isValid);
	}
  @Test
	public void givenFirstName_WhenHappy_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Deepali");
	    Assert.assertTrue( isValid);
	}
  
  @Test
	public void givenFirstName_WhenSad_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("deepali");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
 	public void givenFirstName_WhenFirstLetterSmall_ShouldReturnFalse() {
 		UserRegistration user = new UserRegistration();
 		boolean isValid = user.validateFirstName("deepali");
 	    Assert.assertFalse(isValid);
 	    
 	}
  @Test
	public void givenFirstName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("de");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Dee67");
	    Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenFirstName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateFirstName("Deep#");
		Assert.assertFalse(isValid);
	    
	}
  @Test
	public void givenLastName_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Patil");
		Assert.assertTrue( isValid);
	}
  @Test
	public void givenLastName_WhenHappy_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Patil");
	    Assert.assertTrue( isValid);
	}

@Test
	public void givenLastName_WhenSad_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("patil");
	    Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenFirstLetterSmall_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("patil");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenEmptyString_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("pa");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingNumber_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Pa35");
		Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenLastName_WhenHavingSpecialChar_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateLastName("Pat#il");
		Assert.assertFalse(isValid);
	    
	}

@Test
	public void givenEmail_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateEmail("abc@gmail.com");
	    Assert.assertTrue(isValid);
	}
@Test
	public void givenEmail_WhenHappy_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateEmail("abc@bl.in");
	    Assert.assertTrue( isValid);
	}

@Test
	public void givenEmail_WhenSad_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validateEmail("abcgmail.com");
	    Assert.assertFalse(isValid);
	    
	}
@Test
public void givenEmail_WhenEmailWithoutSpecialChar_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("abcgmail.com");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmailWithoutDotNotation_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("abc@gmailcom");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenEmptyString_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenEmail_WhenShort_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validateEmail("pa");
	Assert.assertFalse(isValid);
    
}

@Test
public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePhoneNumber("917856342311");
    Assert.assertTrue( isValid);
}
@Test
	public void givenPhoneNo_WhenHappy_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhoneNumber("917856342311");
	    Assert.assertTrue( isValid);
	}

@Test
	public void givenPhoneNo_WhenSad_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhoneNumber("91343656");
	    Assert.assertFalse(isValid);
	    
	}
@Test
	public void givenPhoneNo_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.validatePhoneNumber("91343656");
	    Assert.assertFalse(isValid);
	    
	}
@Test
public void givenPassword_WhenOneNumericValue_ShouldReturnTrue() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePhoneNumber("passWord@123");
    Assert.assertTrue( isValid);
}
@Test
public void givenPassword_WhenHappy_ShouldReturnTrue() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePhoneNumber("passWord@123");
    Assert.assertTrue( isValid);
}
@Test
public void givenPassword_WhenSad_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePassword("pass12@");
    Assert.assertFalse(isValid);
    
}
@Test
public void givenPassword_WhenShort_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePassword("pass@3");
	Assert.assertFalse(isValid);
    
}
@Test
public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() {
	UserRegistration user = new UserRegistration();
	boolean isValid = user.validatePassword("Paassword");
	Assert.assertFalse(isValid);
    
}

}
