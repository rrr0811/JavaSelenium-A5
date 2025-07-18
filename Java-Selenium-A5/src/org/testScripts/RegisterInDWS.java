package org.testScripts;

import org.generic_utilities.BaseTest;
import org.generic_utilities.FLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(org.generic_utilities.MyListener.class)
public class RegisterInDWS extends BaseTest{
	@Test
	public void register() {
		//fetching the test data's from excel and storing in variables
		String sheetName = "Sheet1";
		String gender = FLib.readDataFromExcel(sheetName, 1, 0);
		String firstName = FLib.readDataFromExcel(sheetName, 1, 1);
		String lastName = FLib.readDataFromExcel(sheetName, 1, 2);
		String email = FLib.readDataFromExcel(sheetName, 1, 3);
		String password = FLib.readDataFromExcel(sheetName, 1, 4);
		//script
		driver.findElement(By.linkText("Register")).click();
		WebElement maleRadioButton = driver.findElement(By.id("gender-Male"));
		WebElement femaleRadioButton = driver.findElement(By.id("gender-female"));
		if(gender.equals("male"))
		{
			maleRadioButton.click();
		}else
		{
			femaleRadioButton.click();
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(password);;
		driver.findElement(By.id("register-button")).click();
	}
}
