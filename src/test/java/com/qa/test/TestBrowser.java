package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestBrowser {

	@Test
	public static void m1() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICKY\\Desktop\\Liya\\selelib\\chromedriver.exe");  
    
		WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.arsenal.com/");  
		driver.close();
	}
}
