package org.batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jawa {

	@Test
	public void bobber42()
	{
		Reporter.log("launching 42Bobber Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/42-bobber");
		driver.quit();
	}
	
	@Test
	public void perak()
	{
		Reporter.log("launching Perak Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/motorcycles/perak");
		driver.quit();
	}
}
