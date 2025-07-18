package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickUsingActions {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/");
		WebElement motorCycles = driver.findElement(By.partialLinkText("MOTORCYCLES"));
		Actions actions = new Actions(driver);
		actions.click(motorCycles).perform();
		//actions.moveToElement(motorCycles).click().perform();
	}
}
