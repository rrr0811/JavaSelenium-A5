package org.generic_utilities;

import java.util.HashMap;

public class FrequencyofACharacter {
	public static void main(String[] args) {
		String s = "Java";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i = 0 ; i<s.length() ; i++)
		{
			char ch = s.charAt(i);
			if(hm.containsKey(ch))
			{
				int value = hm.get(ch);
				hm.put(ch, ++value);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		System.out.println(hm);
	}
}
