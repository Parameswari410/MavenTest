package com.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TestBrowser {

	@Test
	public static void m1() {
		
		ExtentReports extent = new ExtentReports("extent_report.html");
		ExtentTest test = extent.startTest("Launc Browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VICKY\\Desktop\\Liya\\selelib\\chromedriver.exe");  
    
		test.log(LogStatus.INFO, "Luanching browser");
		WebDriver driver=new ChromeDriver();  
		test.log(LogStatus.INFO, "Naviatin to url");
		driver.navigate().to("http://www.arsenal.com/");  
		test.log(LogStatus.INFO, "Closin browser");
		driver.close();
		
		extent.endTest(test);
		extent.flush();
	}
}
