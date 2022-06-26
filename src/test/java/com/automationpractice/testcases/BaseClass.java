package com.automationpractice.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	
	public String baseurl = "http://automationpractice.com/";
	public WebDriver driver;
	
	@BeforeClass
	public void initialSetup() {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	} 
	
	@AfterClass
	public void cleanUp() {
		driver.close();
		driver.quit();
	}
}
