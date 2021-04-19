package test;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
public class SeleniumTesting {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "chromedriver");
	WebDriver driver  = new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	driver.manage().window().maximize();
}

	
	
		

		
		
		
	}

