package org.mouseEvents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingByUsingOffSet {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Actions actions = new Actions(driver);
		actions.scrollByAmount(0, 800).perform();
		Thread.sleep(2000);
		actions.scrollByAmount(0, -200).perform();
	}
}
