package org.takesscreenshot;

import java.time.LocalDateTime;

public class FetchingTimeAndDate {
	public static void main(String[] args) {
		LocalDateTime ldt = LocalDateTime.now();
		String timeStamp = ldt.toString().replace(":", "-");
		System.out.println(timeStamp);
	}
}
