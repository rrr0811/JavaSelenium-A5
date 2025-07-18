package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformDrapAndDropInDhtml {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Actions actions = new Actions(driver);
		for(int i = 1; i<=7 ; i++)
		{
			WebElement capital = driver.findElement(By.id("box"+i));
			WebElement country= driver.findElement(By.id("box10"+i));
			actions.dragAndDrop(capital, country).perform();
		}
	}
}
