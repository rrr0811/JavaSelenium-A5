package org.handling_popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToHandleTimerAlertInDemoQA {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://demoqa.com/alerts");
		WebElement timerAlertButton = driver.findElement(By.id("timerAlertButton"));
		Actions actions = new Actions(driver);
		actions.scrollToElement(timerAlertButton).scrollByAmount(0, 200)
		.click(timerAlertButton).perform();
		explicitWait.until(ExpectedConditions.alertIsPresent());
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
}
