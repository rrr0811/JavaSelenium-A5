package org.locator_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectmethods {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement carsDropDown = driver.findElement(By.id("multiselect1"));
		Select s = new Select(carsDropDown);
		//s.selectByIndex(0);
		
		s.selectByVisibleText("Hyundai");
	}
}
