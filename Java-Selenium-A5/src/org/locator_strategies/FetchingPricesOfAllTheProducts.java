package org.locator_strategies;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FetchingPricesOfAllTheProducts {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox"))
			.sendKeys("noise smartwatch for men");
		driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> prices = 
				 driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		 System.out.println(prices.size());
		 
		 for(WebElement price : prices)
		 {
			 System.out.println(price.getText());
		 }
	}
}
