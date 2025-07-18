package org.webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyElementIsEnabled {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement button1 = driver.findElement(By.id("but1"));
		WebElement button2 = driver.findElement(By.id("but2"));
		System.out.println(button1.isEnabled());
		System.out.println(button2.isEnabled());
	}
}
