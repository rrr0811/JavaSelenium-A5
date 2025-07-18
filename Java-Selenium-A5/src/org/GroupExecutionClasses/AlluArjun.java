package org.GroupExecutionClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AlluArjun {

	@Test(groups = {"Pan India", "TFI"})
	public void launchWikiPedia()
	{
		Reporter.log("launching Allu Arjun Page", true);
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Allu_Arjun");
		driver.quit();
	}
}
