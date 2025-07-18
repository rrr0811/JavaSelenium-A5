package org.webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingZomato {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
		System.out.println("hello");
	}
}
