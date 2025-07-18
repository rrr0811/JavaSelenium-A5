package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingTheWindowId {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yamaha-motor-india.com/");
		String windowId = driver.getWindowHandle();
		System.out.println(windowId);
	}
}
