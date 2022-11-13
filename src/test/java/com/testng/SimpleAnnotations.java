package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleAnnotations {
	
	@BeforeSuite
	public void setProperty() {
		System.out.println("Property Setting");
	}
	
	@BeforeTest
	public void browserLaunch() {
		System.out.println("Browser Launch");
	}
	
	@BeforeClass
	public void urlLaunch() {
		System.out.println("URL Launch");
	}
	
	@BeforeMethod
	public void signIn() {
		System.out.println("Sign in");
	}
	
	@Test(priority=-1)
	public void women() {
		System.out.println("Women");
	}
	
	@Test(priority=0)
	public void men() {
		System.out.println("Men");
	}
	
	@Test(invocationCount = 3)
	public void kids() {
		System.out.println("Kids");
	}
	
	@AfterMethod
	public void signOut() {
		System.out.println("Sign Out");
	}
	
	@AfterClass
	public void screenshot() {
		System.out.println("ScreenShot");
	}
	
	@AfterTest
	public void close() {
		System.out.println("Close");
	}
	
	@AfterSuite
	public void quit() {
		System.out.println("Quit");
	}
}
