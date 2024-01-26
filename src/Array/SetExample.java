package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SetExample {
	public static void getCharcount(String name) {
	Map<Character, Integer> charMap = new HashMap<Character, Integer>();
	char strArray[] = name.toCharArray();
	
	for(char c:strArray) {
		if(charMap.containsKey(c)) {
			charMap.put(c, charMap.get(c) + 1);
			
		}else {
			charMap.put(c, 1);
		}
	}
	System.out.println(name+" :" +charMap);
	
}

	
	public static void main(String[] args) {
     
//		String str = "Helllooo Wooorllllddd";
//		
//		HashSet<String> set = new HashSet<String>();
//		set.add(str);
//		System.out.println(set);
//		
		getCharcount("Helllooo Wooorllllddd");
		
		
		
	}
}
//Helllooo Wooorllllddd
//
//Provide count of each letter in above sentence without using for loop
//
//Try to solve this today
//
//Set <String> word= new HashSet<String>();
//			word.add("Helllooo Wooorllllddd");
//			String string = word.toString();
//			char[] charArray = new char[string.length()];
//			System.out.println(string);
//			System.out.println(string.indexOf(string));
//			
//			for (int i = 0; i < str.length(); i++) {
//	            ch[i] = str.charAt(i);
//	        }