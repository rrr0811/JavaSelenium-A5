package org.select_class_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeslectionInOmayo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement carsDropDown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(carsDropDown);
		// verifying cars dropdown is single select or not.
		if (select.isMultiple()) {
			System.out.println("It is a multi select Drop Down");
		} else {
			System.out.println("It is a Single Select Drop Down");
		}
		select.selectByIndex(0);
		select.selectByIndex(3);
		select.selectByVisibleText("Swift");
		select.selectByValue("Hyundaix");
		Thread.sleep(2000);
		select.deselectByIndex(3);
		Thread.sleep(2000);
		select.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		//select.deselectByValue("swiftx");
		select.deselectAll();
	}
}
