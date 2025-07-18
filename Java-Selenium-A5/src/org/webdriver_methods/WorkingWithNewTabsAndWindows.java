package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithNewTabsAndWindows {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/virat.kohli/");
		Thread.sleep(3000);
		//to open a new tab
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://blinkit.com/");
		Thread.sleep(3000);
		//to open a new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zeptonow.com/");
	}
}
