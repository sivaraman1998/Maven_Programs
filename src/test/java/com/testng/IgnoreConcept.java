package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreConcept {
	
	@Test(groups = "Non Veg")
	public void biriyani() {
		System.out.println("Mutton Biriyani");
	}
	
	@Test(groups = "Veg")
	public void chappathi() {
		System.out.println("Chappathi");
	}
	
	@Test(groups = "Non Veg")
	public void friedRice() {
		System.out.println("Beef rice");
	}
	
	@Test(groups = "Non Veg")
	public void noodles() {
		System.out.println("Beef Noodles");
	}
	
	@Test(groups = "Veg")
	public void idly() {
		System.out.println("Idly");
	}
	
	@Test(groups = "Veg")
	public void poori() {
		System.out.println("Chenna Poori");
	}
	
	@Test
	@Ignore
	public void Dhosa() {
		System.out.println("Dhosa");
	}
	
	@Ignore
	@Test
	public void tomatoRice() {
		System.out.println("Tomato Rice");
	}
	
	@Test(enabled = false)
	public void lemonRice() {
		System.out.println("Lemon Rice");
	}
	
}
