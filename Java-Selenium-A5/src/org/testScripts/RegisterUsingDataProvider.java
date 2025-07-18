package org.testScripts;

import java.time.Duration;

import org.generic_utilities.FLib;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterUsingDataProvider {

	@Test(dataProvider = "register data provider", dataProviderClass = org.generic_utilities.DataProviderClass.class )
	public void register(String gender, String firstName, String lastName, String email, String password)
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(FLib.readDataFromProperties("url"));
		driver.findElement(By.linkText("Register")).click();
		WebElement maleRadioButton = driver.findElement(By.id("gender-male"));
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
		driver.quit();
	}
}
