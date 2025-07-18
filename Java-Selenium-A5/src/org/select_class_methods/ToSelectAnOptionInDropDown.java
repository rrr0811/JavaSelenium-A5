package org.select_class_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelectAnOptionInDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select select = new Select(monthDropDown);
		//verifying month dropdown is single select or not.
		if(select.isMultiple())
		{
			System.out.println("It is a multi select Drop Down");
		}
		else
		{
			System.out.println("It is a Single Select Drop Down");
		}
		Thread.sleep(2000);
		//selecting an option based on index
		select.selectByIndex(0);
		Thread.sleep(2000);
		//selecting an option based on visible text
		select.selectByVisibleText("Nov");
		Thread.sleep(2000);
		//selecting an option based on value
		select.selectByValue("7");
	}
}
