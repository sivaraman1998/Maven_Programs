package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_Concept {

	@Test
	@Parameters({ "username", "password" })
		// first preference goes to xml file, if xml does not have parameters then it will take from here
	public void credentials(@Optional("xyz") String username, @Optional("123") String password) {
		System.out.println("Username is : " + username);

		System.out.println("Password is : " + password);
	}

}
