package org.batchExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Yamaha {
	@Test
	public void r15()
	{
		Reporter.log("launching R15 Official Site", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15v4.html");
		driver.quit();
	}
}
