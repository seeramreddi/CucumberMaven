package com.cucumber.CucumberPageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
// this class is used with non page object model
public class AbstractPageStepDefinition {
	
	
	protected static WebDriver driver;
	
	protected WebDriver getDriver(){

		
		if (driver == null){
			System.setProperty("webdriver.chrome.driver", "C://Users/rajesh.s/Desktop/Rajesh/QA/Selenium_Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		return driver;
	}
	
	
	
}
