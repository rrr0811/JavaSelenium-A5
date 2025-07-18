package org.select_class_methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement carsDropDown = driver.findElement(By.id("multiselect1"));
		Select select = new Select(carsDropDown);
		List<WebElement> options = select.getOptions();
		for( WebElement option : options)
		{
			select.selectByVisibleText(option.getText());
		}
		
		select.deselectByIndex(0);
		select.deselectByVisibleText("Audi");
		
		//to print the selected options
		List<WebElement> selectedOptions = select.getAllSelectedOptions();
		System.out.println("Selected Options are : ");
		for(WebElement selectedOption : selectedOptions)
		{
			System.out.println(selectedOption.getText());
		}
		
		//to print the unselected options
		options.removeAll(selectedOptions);
		System.out.println("Unselected Options are : ");
		for( WebElement option : options)
		{
			System.out.println(option.getText());
		}
	}
}
