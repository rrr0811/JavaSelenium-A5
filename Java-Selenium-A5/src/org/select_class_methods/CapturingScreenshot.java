package org.select_class_methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapturingScreenshot {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yamaha-motor-india.com/");
		//step 1 : convert driver ref into TakesScreenshot type
		TakesScreenshot ts = (TakesScreenshot)driver;
		//step 2 : call getScreenshotAs() --> Store the file
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		//step3 : create a new file and copy the image
		File dest = new File("C:\\Users\\Harsha G R\\OneDrive\\Desktop\\ABC.png");
		FileHandler.copy(screenshot, dest);
	}
}
