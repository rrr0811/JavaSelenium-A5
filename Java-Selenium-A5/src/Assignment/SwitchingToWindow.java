package Assignment;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchingToWindow {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String expectedTitle = "Zomato";
		driver.get("https://www.swiggy.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.zomato.com/");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://shariefbhai.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String x : allWindowIds)
		{
			Thread.sleep(1000);
			driver.switchTo().window(x);
			if(driver.getTitle().equals(expectedTitle))
			{
				break;
			}
		}
	}
}
