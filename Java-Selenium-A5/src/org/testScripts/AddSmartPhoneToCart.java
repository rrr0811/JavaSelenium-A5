package org.testScripts;

import org.generic_utilities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AddSmartPhoneToCart extends BaseTest{
	@Test
	public void verify_smart_phone_is_added_to_cart()
	{
		String expectedTitleofElectronicsPage = "Demo Web Shop. Electronics";
		//String expectedTitleofCellPhonesPage = "Demo Web Shop. Cell phones";
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		String actualTitleofElectronicsPage = driver.getTitle();
		Assert.assertEquals
		(actualTitleofElectronicsPage, expectedTitleofElectronicsPage, "Title is not not matching");
		Reporter.log("Electronics Page Displayed");
		driver.findElement(By.partialLinkText("Cell phones")).click();
		//String actualTitleofCellPhonespage = driver.getTitle();
		//Assert.assertEquals(actualTitleofCellPhonespage, expectedTitleofCellPhonesPage);
		Assert.assertTrue(driver.getTitle().contains("Cell hones"), "doesn't contains cell phone");
		driver.findElement(By.xpath("//a[text()='Smartphone']/../..//input[@value='Add to cart']"))
		.click();
		WebElement notification = driver.findElement(By.className("content"));
		String expectedAddToCartMsg = "The product has been adding to your shopping cart";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(notification.getText(), expectedAddToCartMsg, "not matching ");
		System.out.println("*********");
		System.out.println("not stopped");
		sa.assertAll();
	}
}
