package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Hard_Assert {
	
	@Test
	public void sample() {
		String actual="Sivaraman";
		String expected="Sivaraman321";//AssertionError
		
		Assert.assertEquals(actual, expected);
		System.out.println("Validation");
	}
}
