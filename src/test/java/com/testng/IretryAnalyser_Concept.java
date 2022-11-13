package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class IretryAnalyser_Concept {
	
	@Test
	public void sample() {
		String actual="Sowpriya";
		String expected="Sowpriya";//If exp and actual will be different, then it returns passed-Soft Assert
		
		SoftAssert s=new SoftAssert();
		s.assertEquals(actual, expected);
		System.out.println("Verification");
		
	}
	
	@Test(retryAnalyzer = Rerun.class)
	public void password() {
		String actual="12345";
		String expected = "12534";
		
		Assert.assertEquals(actual, expected);
	}
}
