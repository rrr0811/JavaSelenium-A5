package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickUsingActions {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		Actions actions = new Actions(driver);
		WebElement button = driver.findElement(By.id("pickfiles"));
		actions.contextClick(button).perform();
		//actions.moveToElement(button).contextClick().perform();
	}
}
