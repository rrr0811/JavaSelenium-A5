package org.webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingAndChangingThePositionOfTheBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Point actualPosition = driver.manage().window().getPosition();
		System.out.println("X : "+actualPosition.getX());
		System.out.println("Y : "+actualPosition.getY());
		
		Point targetPosition = new Point(100, 600);
		driver.manage().window().setPosition(targetPosition);
	}
}
