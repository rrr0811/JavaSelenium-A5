package org.batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hero {

	@Test
	public void harley440x()
	{
		Reporter.log("launching Harley 440x Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.harley-davidson.com/in/en/motorcycles/x-440.html");
		driver.quit();
	}
}
