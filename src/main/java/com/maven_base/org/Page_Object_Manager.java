package com.maven_base.org;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public static WebDriver driver;

	private Login_Page lp;

	private Home_Page hp;

	private Select_Hotel sh;

	private BookHotel bh;

	public Page_Object_Manager(WebDriver driver2) {
		Page_Object_Manager.driver = driver2;
	}

	public Login_Page getLp() {
		lp = new Login_Page(driver);// login page object
		return lp;
	}

	public Home_Page getHp() {
		hp = new Home_Page(driver);// search page object
		return hp;
	}

	public Select_Hotel getSelectHotel() {
		sh = new Select_Hotel(driver);// select page object
		return sh;
	}

	public BookHotel getBook() {
		bh = new BookHotel(driver);//book page object
		return bh;
	}

}
