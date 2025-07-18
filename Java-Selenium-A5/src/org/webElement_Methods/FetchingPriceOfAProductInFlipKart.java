package org.webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingPriceOfAProductInFlipKart {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Samsung a34 5g", Keys.ENTER);
		WebElement priceElement = driver.findElement(By.xpath(
				"(//div[text()='SAMSUNG Galaxy A34 5G (Awesome Violet, 256 GB)']/../..//div[contains(text(),'₹')])[1]"));
		System.out.println(priceElement.getText());
	}
}
