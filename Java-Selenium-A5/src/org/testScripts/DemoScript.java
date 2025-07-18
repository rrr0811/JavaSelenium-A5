package org.testScripts;

import org.element_repository.BasePage;
import org.generic_utilities.BaseTest;
import org.testng.annotations.Test;

public class DemoScript extends BaseTest{

	@Test
	public void demoScript() throws InterruptedException
	{
		BasePage bp = new BasePage(driver);
		bp.getLoginLink().click();
		Thread.sleep(3000);
	}
}
