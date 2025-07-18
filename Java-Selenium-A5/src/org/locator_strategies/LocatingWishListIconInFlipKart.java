package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingWishListIconInFlipKart {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 5c");
		driver.findElement(By.xpath("//button[contains(@title,'Search')]")).click();
		driver.findElement(
				By.xpath("//div[text()='Apple iPhone 5C (Pink, 8 GB)']/../../..//*[name()='svg']"))
		.click();
	}
}
