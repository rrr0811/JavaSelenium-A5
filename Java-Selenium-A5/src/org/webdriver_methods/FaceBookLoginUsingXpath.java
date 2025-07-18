package org.webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLoginUsingXpath {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@data-testid='royal-email']")).sendKeys("KGF");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("123");
		driver.findElement(By.xpath("//button[@data-testid='royal-login-button']")).click();
	}
}
