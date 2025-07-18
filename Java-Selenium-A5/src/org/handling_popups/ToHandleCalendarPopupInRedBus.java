package org.handling_popups;

import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleCalendarPopupInRedBus {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String temp = ldt.getMonth().toString();
		String month = temp.charAt(0) + temp.substring(1).toLowerCase();
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.redbus.com/");
		driver.findElement(By.id("date-box")).click();
		driver.findElement(By.xpath(
				"//div[text()='"+month+"']/../..//span[text()='"+date+"']")).click();
	}
}
