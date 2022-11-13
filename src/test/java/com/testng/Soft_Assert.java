package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assert {
	
	@Test
	public void sample() {
		String actual="Sowpriya";
		String expected="Sowpriya123";//If exp and actual will be different, then it returns passed-Soft Assert
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("Verification");
		
	}
}
