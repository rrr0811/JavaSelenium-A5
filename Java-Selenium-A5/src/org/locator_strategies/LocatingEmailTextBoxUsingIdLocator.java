package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingEmailTextBoxUsingIdLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//locating email text box
		WebElement emailTextBox = driver.findElement(By.id("email"));
		emailTextBox.sendKeys("harshavardhan");
		driver.findElement(By.id("pass")).sendKeys("1234");
		Thread.sleep(2000);
		emailTextBox.sendKeys(" G R");
	}
}
