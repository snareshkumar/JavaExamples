package com.naresh.javaprograms;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfCharacters {

	public static void main(String[] args) {
		String testString = "geekforkes";
		Map<Character, Integer> countMap = new HashMap<>();
		
		char[] charArr = testString.toCharArray();
		
		for(char c : charArr) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
				
			}else {
				countMap.put(c,1);
			}
		}
		
		 for (Map.Entry entry : countMap.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 

	}

}
