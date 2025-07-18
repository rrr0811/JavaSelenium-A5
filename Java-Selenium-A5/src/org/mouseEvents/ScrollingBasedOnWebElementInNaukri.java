package org.mouseEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class ScrollingBasedOnWebElementInNaukri {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		WebElement resumeWriting = 
				driver.findElement(By.xpath("//span[text()='Resume writing']"));
		Actions actions = new Actions(driver);
		//actions.scrollToElement(resumeWriting).scrollByAmount(0, 200).perform();
		actions.scrollFromOrigin(ScrollOrigin.fromElement(resumeWriting), 0, 200).perform();
	}
}
