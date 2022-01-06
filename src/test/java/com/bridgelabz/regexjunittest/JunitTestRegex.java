package com.bridgelabz.regexjunittest;


import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JunitTestRegex {
	String Input;
	boolean ExpectedResult;
	
	public JunitTestRegex(boolean ExpectedResult, String Input) {
		super();
		this.Input = Input;
		this.ExpectedResult = ExpectedResult;
	}
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
	@Parameterized.Parameters
public static Collection inputs() {
	return Arrays.asList(new Object[][] {
		{"abc@yahoo.com", true},
		{"abc-100@yahoo.com", true},
		{"abc.100@yahoo.com", true},
		{"abc111@abc.com", true},
		{"abc-100@abc.net", true},
		{"abc.100@abc.com.au", true},
		{"abc@1.com", true},
		{"abc@gmail.com.com", true},
		{"abc+100@gmail.com", true},
		{"abc@.com.com" , false},
		{"abc123@gmail.a" , false},
		{"abc123@.com" , false},
		{"abc123@.com.com" , false},
		{".abc@abc.com" , false},
		{"abc()*@gmail.com" , false},
		{"abc@%*.com" , false},
		{"abc..2002@gmail.com" , false},
		{"abc.@gmail.com" , false},
		{"abc@abc@gmail.com" , false},
		{"abc@gmail.com.1a" , false},
		{"abc@gmail.com.aa.au^$" , false}
		} );
}
	@Test
	public void givenEmail_WhenValid_ShowReturnTrue() {
		UserRegistration userRegistration = new UserRegistration();
		boolean result = userRegistration.userEmail(this.Input);
		Assert.assertEquals(this.ExpectedResult, result);
	}

	@Test
	public void givenPhoneNo_WhenProper_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPhoneNo("917856342311");
	    Assert.assertTrue( isValid);
	}
	@Test
		public void givenPhoneNo_WhenHappy_ShouldReturnTrue() {
			UserRegistration user = new UserRegistration();
			boolean isValid = user.userPhoneNo("917856342311");
		    Assert.assertTrue( isValid);
		}

	@Test
		public void givenPhoneNo_WhenSad_ShouldReturnFalse() {
			UserRegistration user = new UserRegistration();
			boolean isValid = user.userPhoneNo("91343656");
		    Assert.assertFalse(isValid);
		    
		}
	@Test
		public void givenPhoneNo_WhenShort_ShouldReturnFalse() {
			UserRegistration user = new UserRegistration();
			boolean isValid = user.userPhoneNo("91343656");
		    Assert.assertFalse(isValid);
		    
		}
	@Test
	public void givenPassword_WhenOneNumericValue_ShouldReturnTrue() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("passWord@123");
	    Assert.assertTrue( isValid);
	}

	@Test
	public void givenPassword_WhenShort_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("pass@3");
		Assert.assertFalse(isValid);
	    
	}
	@Test
	public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() {
		UserRegistration user = new UserRegistration();
		boolean isValid = user.userPassword("Paassword");
		Assert.assertFalse(isValid);
	    
	}

}
