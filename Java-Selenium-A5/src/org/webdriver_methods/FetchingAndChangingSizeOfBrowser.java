package org.webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAndChangingSizeOfBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Dimension actualSize = driver.manage().window().getSize();
		System.out.println("Height : "+actualSize.getHeight());
		System.out.println("Width : "+actualSize.getWidth());
		Dimension targetSize = new Dimension(600, 250);
		driver.manage().window().setSize(targetSize);
	}
}
