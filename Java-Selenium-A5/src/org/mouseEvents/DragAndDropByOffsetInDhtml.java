package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropByOffsetInDhtml {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-2.html");
		WebElement cat = driver.findElement(By.id("box1"));
		Actions actions =new Actions(driver);
		actions.dragAndDropBy(cat, 400, 100).perform();
	}
}
