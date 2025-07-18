package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByOffSetInAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 16", Keys.ENTER);
		WebElement leftSlider = driver.findElement(By.xpath("//input[contains(@id,'lower-bound-slider')]"));
		Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.dragAndDropBy(leftSlider, 30, 0).perform();
	}
}
