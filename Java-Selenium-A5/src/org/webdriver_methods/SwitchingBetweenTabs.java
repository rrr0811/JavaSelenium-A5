package org.webdriver_methods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingBetweenTabs {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String expectedUrl = "https://jokerandwitch.com/";
		//navigating into joker and witch
		driver.get("https://jokerandwitch.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		//navigating into fossil
		driver.get("https://www.fossil.com/en-in/");
		Thread.sleep(3000);
		//navigating into rolex
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.rolex.com/");
		Thread.sleep(3000);
		//navigating into fastrack
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.fastrack.in/");
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds);
		for(String windowId : allWindowIds)
		{
			Thread.sleep(2000);
			driver.switchTo().window(windowId);
			if(driver.getCurrentUrl().equals(expectedUrl))
				break;
		}
	}
}
