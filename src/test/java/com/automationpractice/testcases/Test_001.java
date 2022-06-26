package com.automationpractice.testcases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.automationpractice.pageobjects.SearchPage;



public class Test_001 extends BaseClass {
	
	@Test
	public void SearchTest () {
		SearchPage sp = new SearchPage(driver);
		sp.searchBoxElement.sendKeys("Faded");
		sp.searchButtonElement.click();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		Boolean productBoolean =  driver.findElement(By.xpath("//a[@class='product-name' and contains(text(),'Faded')]")).isDisplayed();
		
		if(productBoolean) {
			System.out.println("Product is Displayed");
		} else {
			System.out.println("Product is not Displayed");
		}
		
		
	}
	
	}
	

