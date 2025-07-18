package org.testScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UnderstandingTestNG {
	@Test
	public void test2()
	{
		Reporter.log("test2()", true);
		Reporter.log("launching Selenium Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		//Assert.fail();
		driver.quit();
	}
	
	@Test(dependsOnMethods = {"test2", "test3"})
	public void test1()
	{
		Reporter.log("test1()", true);
		Reporter.log("launching Java Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.java.com/en/");
		driver.quit();
	}
	
	@Test
	public void test3()
	{
		Reporter.log("test3()", true);
		Reporter.log("launching Jmeter Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jmeter.apache.org/");
		driver.quit();
	}
	
	
}
