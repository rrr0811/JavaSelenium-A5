package org.webdriver_methods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingNavigationMethods {
	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver = new ChromeDriver();
		//navigating into jawa motors web page
		driver.get("https://www.jawamotorcycles.com/");
		Thread.sleep(5000);
		//navigating into hayabusa web page
		driver.get("https://www.suzukimotorcycle.co.in/product-details/hayabusa");
		Thread.sleep(5000);
		//navigating back to jawa motors using back()
		driver.navigate().back();
		Thread.sleep(5000);
		//navigating forward to hayabusa using forward()
		driver.navigate().forward();
		Thread.sleep(5000);
		//refreshing the web page
		driver.navigate().refresh();
		Thread.sleep(5000);
		//navigating into ferrero rocher using navigate.to(String url)
		driver.navigate().to("https://www.ferrerorocher.com/in/en/");
		Thread.sleep(5000);
		//navigating into cadbury gifting using navigate.to(URL url)
		driver.navigate().to(new URL("https://cadburygifting.in/"));	
	}
}
