package org.testScripts;

import org.generic_utilities.BaseTest;
import org.generic_utilities.FLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic_utilities.MyListener.class)
public class LoginToDWS extends BaseTest{
	@Test
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		WebElement emailTextBox = driver.findElement(By.id("Email"));
		emailTextBox.sendKeys(FLib.readDataFromProperties("email"));
		driver.navigate().refresh();
		emailTextBox.sendKeys("Harsha");
		
//		driver.findElement(By.id("Password")).sendKeys(FLib.readDataFromProperties("password"));
//		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
