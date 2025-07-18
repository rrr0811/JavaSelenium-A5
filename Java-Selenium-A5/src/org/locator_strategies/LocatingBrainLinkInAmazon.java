package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingBrainLinkInAmazon {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Human Brain");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(
				By.partialLinkText("Color-Coded Life Size Teaching Anatomy of Brain")).click();
	}
}
