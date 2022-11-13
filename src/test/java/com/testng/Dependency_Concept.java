package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency_Concept {

	@Ignore
	@Test
	public void valid_Credentials() {
		System.out.println("Valid Username and Password");
	}

	@Test(dependsOnMethods = "valid_Credentials")
	public void login() {
		System.out.println("Login Successfully");
	}

	@Test(dependsOnMethods = "login")
	public void homePage() {
		System.out.println("Home Page open successfully");
	}
	
	@Test(dependsOnMethods = "homePage")
	public void posts() {
		System.out.println("Posts page open successfully");
	}

	@Test(dependsOnMethods = "posts")
	public void friendRequest() {
		System.out.println("Friend Request page open successfully");
	}

	@Test(dependsOnMethods = "friendRequest")
	public void messages() {
		System.out.println("Messages page open successfully");
	}
}
