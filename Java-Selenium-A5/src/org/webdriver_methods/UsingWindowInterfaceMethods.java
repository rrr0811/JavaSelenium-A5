package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingWindowInterfaceMethods {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//to maximize the browser
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//to open browser in fullscreen mode
		driver.manage().window().fullscreen();
		Thread.sleep(3000);
		//to minimize the browser
		driver.manage().window().minimize();
	}
}
