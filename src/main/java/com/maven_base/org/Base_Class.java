package com.maven_base.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver launchUrl(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//Driver2//chromedriver.exe");

			driver = new ChromeDriver();

//			driver.manage().window().maximize();
		}
		return driver;

	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void passKeys(WebElement keys, String name) {
		keys.sendKeys(name);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void selectDropDownIndex(WebElement text1, int index) {
		Select s = new Select(text1);
		s.selectByIndex(index);
	}

	public static void selectDropDownValue(WebElement text2, String value) {
		Select s = new Select(text2);
		s.selectByValue(value);
	}

	public static void selectDropDownText(WebElement text3, String visible) {
		Select s = new Select(text3);
		s.selectByVisibleText(visible);

	}

}
