package org.webElement_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCheckAlignmentInFaceBook {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement emailTextBox = driver.findElement(By.id("email"));
		Dimension emailTextBoxSize = emailTextBox.getSize();
		Point emailTextBoxLocation = emailTextBox.getLocation();
		WebElement passwordTextBox = driver.findElement(By.id("passContainer"));
		Dimension passwordTextBoxSize = passwordTextBox.getSize();
		Point passwordTextBoxLocation = passwordTextBox.getLocation();
		
		int leftAlignmentDifference = emailTextBoxLocation.getX()
				- passwordTextBoxLocation.getX();
		if(leftAlignmentDifference>-3 && leftAlignmentDifference < 3)
		{
			System.out.println("Left Alignment is proper");
		}
		else
		{
			System.out.println("Left Alignment is not proper");
		}
		
		int rightAlignmentDifference = (emailTextBoxLocation.getX()+ emailTextBoxSize.getWidth())
				- (passwordTextBoxLocation.getX() + passwordTextBoxSize.getWidth());
		if(rightAlignmentDifference >-3 && rightAlignmentDifference<3)
		{
			System.out.println("Right Alignment is proper");
		}
		else
		{
			System.out.println("Right Alignment is not proper");
		}
		
		int overlappingDifference = passwordTextBoxLocation.getY() 
				- (emailTextBoxLocation.getY() + emailTextBoxSize.getHeight());
		if(overlappingDifference > 0)
		{
			System.out.println("not overlapped");
		}
		else
		{
			System.out.println("overlapped");
		}
		
	}
}
