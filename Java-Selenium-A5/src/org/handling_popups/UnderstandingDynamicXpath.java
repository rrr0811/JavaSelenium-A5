package org.handling_popups;

import java.time.LocalDateTime;

public class UnderstandingDynamicXpath {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		int date = ldt.getDayOfMonth();
		String temp = ldt.getMonth().toString();
		String month = temp.charAt(0) + temp.substring(1).toLowerCase();
		String xpath = "//div[text()='"+month+"']/../..//span[text()='"+date+"']";
		System.out.println(xpath);		
	}
}
