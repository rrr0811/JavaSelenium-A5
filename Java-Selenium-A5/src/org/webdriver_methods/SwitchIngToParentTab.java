package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchIngToParentTab {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//navigating into amazon
		driver.get("https://www.amazon.in/");
		//fetching the window id of main tab
		String parentWindowId = driver.getWindowHandle();
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigating into kalki fashion
		driver.get("https://in.kalkifashion.com/");
		//to open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		//navigating into flipkart
		driver.get("https://www.flipkart.com/");
		//switching back to main tab
		driver.switchTo().window(parentWindowId);
	}
}
