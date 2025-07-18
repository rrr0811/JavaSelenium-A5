package org.webdriver_methods;

import java.util.HashSet;
import java.util.Set;

public class ForEach {
	public static void main(String[] args) {
		String[] ipl = {"RCB", "CSK", "MI", "DC", "GT"};
		for(String x : ipl)
		{
			System.out.println(x);
		}
		
		Set<String> heroes = new HashSet<String>();
		heroes.add("SRK");
		heroes.add("Allu arjun");
		heroes.add("Yash");
		System.out.println(heroes);
		
		for(String hero : heroes)
		{
			System.out.println(hero);
		}
	}
}
