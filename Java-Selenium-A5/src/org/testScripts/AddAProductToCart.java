package org.testScripts;

import org.generic_utilities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.generic_utilities.MyListener.class)
public class AddAProductToCart extends BaseTest{
	@Test
	public void addingProductToCart()
	{
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//input[@value='Add to Cart']")).click();
	}
}
