package com.maven_base.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;// null driver
	
	public Login_Page(WebDriver driver2) {
		Login_Page.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement user;

	@FindBy(id = "password")
	private WebElement pass;

	@FindBy(id = "login")
	private WebElement log;

	public WebElement getUser() {
		return user;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLog() {
		return log;
	}

}
