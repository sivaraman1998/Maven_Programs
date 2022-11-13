package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized2 {
	
	@Parameters({"username1", "password1"})
	@Test
	public void login(@Optional("abc") String username1, @Optional("1234") int password1) {
		System.out.println("Second Username is : "+username1);
		
		System.out.println("Second Password is : "+password1);
	}
}
