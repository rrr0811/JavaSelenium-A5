package org.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Puneeth {

	@Test(groups = "KFI")
	public void launchWikiPedia()
	{
		Reporter.log("launching Puneeth Page", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Puneeth_Rajkumar");
		driver.quit();
	}
}
