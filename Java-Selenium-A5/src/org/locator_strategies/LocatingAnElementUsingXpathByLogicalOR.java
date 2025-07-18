package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingAnElementUsingXpathByLogicalOR {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Harsha%20G%20R/OneDrive/Desktop/LogicalOperators.html");
		WebElement firstNameTextBox = 
				driver.findElement(By.xpath("//input[@id = 'fn' or @name = 'first']"));
		firstNameTextBox.clear();
		firstNameTextBox.sendKeys("Harsha");
	}
}
