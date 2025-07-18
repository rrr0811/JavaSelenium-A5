package org.generic_utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest{
	
	public static WebDriver driver;
	@Parameters("bname")
	@BeforeClass
	public void launchAndMaximizeBrowser(@Optional("chrome")String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if(browserName.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else if(browserName.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(FLib.readDataFromProperties("url"));
	}
	@AfterClass
	public void tearDownBrowser()
	{
		driver.close();
		driver.quit();
	}
	
	@BeforeMethod
	public void login()
	{
		System.out.println("Before - Method");
	}
	@AfterMethod
	public void logout()
	{
		System.out.println("After - Method");
	}
}
