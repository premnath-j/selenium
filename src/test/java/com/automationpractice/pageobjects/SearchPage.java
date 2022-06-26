package com.automationpractice.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	public SearchPage(WebDriver edriver) {
		PageFactory.initElements(edriver, this);
	}
	
	@FindBy(id = "search_query_top")
	public WebElement searchBoxElement;
	
	@FindBy(name = "submit_search")
	public WebElement searchButtonElement;
	
	@FindBy(xpath = "//a[@class='sf-with-ul' and text()='Women']")
	public WebElement womenMainMenuElement;
	
	@FindBy(xpath = "//a[text()='T-shirts']")
	public WebElement tshirtElement;
}
