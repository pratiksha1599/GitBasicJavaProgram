package com.Practice2;

import java.util.HashMap;
import java.util.Map;

public class OccuranceofCharInStringNaveen {
//test--> t=2, e=1, s=1

	public static void getCharCount(String name) {
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();

		char strArray[] = name.toCharArray();

		for (char c : strArray) {
         if(charMap.containsKey(c)) {
        	 charMap.put(c, charMap.get(c)+1);
         }
         else {
        	 charMap.put(c, 1);
         }
		}
		System.out.println(name+" : "+charMap);

	}

	public static void main(String[] args) {
    getCharCount("test");
    getCharCount(" test test");
	}

}


//test--> 