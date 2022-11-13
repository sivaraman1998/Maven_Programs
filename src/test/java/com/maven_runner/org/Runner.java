package com.maven_runner.org;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.maven_base.org.Base_Class;
import com.maven_base.org.BookHotel;
import com.maven_base.org.Home_Page;
import com.maven_base.org.Login_Page;
import com.maven_base.org.Page_Object_Manager;
import com.maven_base.org.Select_Hotel;
import com.properties.File_Reader_Manager;

public class Runner extends Base_Class {

	public static WebDriver driver = Base_Class.launchUrl("chrome");

	public static Page_Object_Manager pomo = new Page_Object_Manager(driver);
	
	public static Login_Page lp=new Login_Page(driver);
	
	public static Home_Page hp=new Home_Page(driver);
	
	public static Select_Hotel sh=new Select_Hotel(driver);
	
	public static BookHotel bh=new BookHotel(driver); 

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws IOException 
	 */
	public static void main(String[] args) throws InterruptedException, IOException {
		
//		launchUrl("chrome");
		
		//******Get URL*****
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();//Singleton Design Pattern
		getUrl(url);
		
		//*****Login page Constructor****
//		Login_Page lp = new Login_Page(driver);
		
		//**********username sendkeys********************
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passKeys(pomo.getLp().getUser(), username);

//		passKeys(lp.getUser(), "sivaraman1998");

//		WebElement user = driver.findElement(By.id("username"));

//		passKeys(user, "Sivaraman");
		
		//************password sendkeys******
		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passKeys(pomo.getLp().getPass(), password);

//		passKeys(lp.getPass(), "12345");

//		WebElement pass = driver.findElement(By.id("password"));

//		passKeys(pass, "siva123");

		Thread.sleep(3000);
		
		//******login submit**********
		clickOnElement(pomo.getLp().getLog());

//		clickOnElement(lp.getLog());

//		WebElement login = driver.findElement(By.id("login"));

//		clickOnElement(login);
//*****************************************************************************
		
		//******Search page*****
		selectDropDownValue(hp.getLocation(), "New York");
		Thread.sleep(2000);
		selectDropDownValue(hp.getHotels(), "Hotel Sunshine");
		Thread.sleep(2000);
		selectDropDownText(hp.getRoom_type(), "Standard");
		Thread.sleep(2000);
		selectDropDownIndex(hp.getRoom_nos(), 2);
		Thread.sleep(2000);		
		passKeys(hp.getDatepick_in(),"14/10/2022");
		Thread.sleep(2000);
		passKeys(hp.getDatepick_out(), "15/10/2022");
		Thread.sleep(2000);
		selectDropDownIndex(hp.getAdult_room(), 3);
		Thread.sleep(2000);
		selectDropDownValue(hp.getChild_room(), "2");
		Thread.sleep(4000);
		
		clickOnElement(hp.getSearch());
//**************************************************************************************
		//**********Select hotel page*********
		clickOnElement(sh.getRadioBtn());
		Thread.sleep(2000);
		clickOnElement(sh.getContinueBtn());
//*************************************************************************************
		//***********Book hotel page*********
		passKeys(bh.getFirst(), "Sivaraman");
		Thread.sleep(2000);
		passKeys(bh.getLast(), "S");
		Thread.sleep(2000);
		passKeys(bh.getAddress(), "28/41, Alagar Perumal Kovil Street, Vadapalani, Chennai-600026.");
		Thread.sleep(2000);
		passKeys(bh.getCc_num(), "6541123545126321");
		Thread.sleep(2000);
		selectDropDownText(bh.getCc_type(), "American Express");
		Thread.sleep(2000);
		selectDropDownIndex(bh.getCc_exp_month(), 5);
		Thread.sleep(2000);
		selectDropDownText(bh.getCc_exp_year(), "2022");
		Thread.sleep(2000);
		passKeys(bh.getCc_cvv(), "451");
		Thread.sleep(2000);
		clickOnElement(bh.getBook_now());
//**************************************************************************************
		Thread.sleep(5000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Sowpriya.S\\eclipse-workspace\\Maven_ProjectClass\\Screenshot\\Hotelbooking.png");
		FileUtils.copyFile(source, dest);
//*****************************************************************************************
		//********Logout**********
		driver.findElement(By.xpath("//a[text()='Logout']")).click();

	}

}
