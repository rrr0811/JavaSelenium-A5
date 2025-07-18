package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LocatingAddToCartUsingDependentIndependentXpath {
	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).
		sendKeys("Roadster Jeans for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		driver.findElement(
				By.xpath("//span[contains(text(),'|| Cargo Jeans')]/../../../..//button[text()='Add to cart']"))
		.click();
	}
}
