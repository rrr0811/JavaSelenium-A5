package org.synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkingWithExplicitWaitInShopperStack {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("Check Delivery")).sendKeys("411033");
		WebElement checkButton = driver.findElement(By.xpath("//button[text()='Check']"));
		explicitWait.until(ExpectedConditions.elementToBeClickable(checkButton));
		checkButton.click();
	}
}
