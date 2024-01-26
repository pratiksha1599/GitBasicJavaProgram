package com.basic;

public class Ex_vowels {

	public static void main(String[] args) {
		/*String str = "cdac is good", c1 = "", v1 = "";
		int c = 0, v = 0;

		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i); // r a j
			if (c2 == 'a' || c2 == 'e' || c2 == 'i' || c2 == 'o' || c2 == 'u') {
				v1 = v1 + c2; // " "+ a= v1=a
				v++;
			} else {
				c1 = c1 + c2; // " "+r =r
				c++;
			}
		}
		System.out.println("consonent are==" + c1);
		System.out.println("consonent count are ==" + c);
		System.out.println("* *");
		System.out.println("vovoles are==" + v1);
		System.out.println("vovles count are==" + v);*/
		
		
		
		
		
		
		
		String str = "PratikshaPatil";
		String c1=" ",v1=" ";
		int c=0,v=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);	
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				
				v1=v1+ch;
				v++;
			}
			else {
				c1=c1+ch;
				c++;
			}
			
			
			
			
		}
		
		System.out.println("Count of C:" +c);
		System.out.println("Consonent count:"+v1);
		
		System.out.println("Vovels count:" +v);
		System.out.println("vovels are:"+c1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
