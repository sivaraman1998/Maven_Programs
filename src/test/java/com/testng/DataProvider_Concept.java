package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class DataProvider_Concept {
	
	@Test(dataProvider = "input")
	public void credentials(@Optional("xyz") String username, @Optional("123") String password) {
		System.out.println("Username is : " + username);

		System.out.println("Password is : " + password);
	}
	
	@DataProvider
	public Object[][] input() {
		return new Object[][] {
			{"siva","123"},{"sow","345"},{"venki","420"}
		};
	}
}
