package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToOpenALinkInNewTab {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jawamotorcycles.com/");
		WebElement motorcyclesLink = driver.findElement(By.linkText("MOTORCYCLES"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(motorcyclesLink).perform();
		actions.keyUp(Keys.CONTROL).perform();
	}
}
