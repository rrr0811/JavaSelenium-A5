package org.takesscreenshot;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshotOfWebElement {
	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(":", "-");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://cadburygifting.in/");
		WebElement product = driver.findElement(By.xpath(
				"//a[contains(text(),'Cadbury Personalised Heart Gift Box')]/../../../.."));
		//step1 : capture screenshot by using getScreenshotAs
		File screenshot = product.getScreenshotAs(OutputType.FILE);
		//step2 : create a new file and copy screenshot using copy() of FileHandler
		File dest = new File("./errorShots/screenshot"+timeStamp+".png");
		FileHandler.copy(screenshot, dest);
	}
}
