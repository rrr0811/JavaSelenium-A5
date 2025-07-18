package org.frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToAutomateDream11 {
	public static void main(String[] args) {
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.dream11.com/");
		//1. frame(int index)
		//driver.switchTo().frame(0);
		
		//2. frame(String nameOrId)
		//driver.switchTo().frame("send-sms-iframe");
		
		//3. frame(WebElement frameElement)
		WebElement frameElement = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(frameElement);
		driver.findElement(By.id("regEmail")).sendKeys("65432178906");
		//4. defaultContent();
		driver.switchTo().defaultContent();
		driver.findElement(By.id("hamburger")).click();
	}
}
