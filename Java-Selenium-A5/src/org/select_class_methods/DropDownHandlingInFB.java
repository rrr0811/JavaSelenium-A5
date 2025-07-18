package org.select_class_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandlingInFB {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		WebElement dateDropDown = driver.findElement(By.id("day"));
		Select dateSelect = new Select(dateDropDown);
		List<WebElement> dateOptions = dateSelect.getOptions();
		for(int i = 0 ; i< dateOptions.size() ; i++)
		{
			dateSelect.selectByIndex(i);
		}
		
		WebElement monthDropDown = driver.findElement(By.id("month"));
		Select monthSelect = new Select(monthDropDown);
		List<WebElement> monthOptions = monthSelect.getOptions();
		for( WebElement month : monthOptions)
		{
			Thread.sleep(500);
			monthSelect.selectByVisibleText(month.getText());
		}
		
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		List<WebElement> yearOptions = yearSelect.getOptions();
		
		for( WebElement year : yearOptions)
		{
			yearSelect.selectByValue(year.getAttribute("value"));
		}
	}
}
