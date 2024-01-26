package com.basic1;

public class Armstongno {
	public static void main(String[] args) {
		int n = 370;
        int temp=n;
        int r,sum=0;
        
        while(n>0) {
        	r=n%10;
        	n=n/10;
        	sum=sum+r*r*r;
        }
        if(temp==sum) {
        	System.out.println("no. is armstrong");
        }
        else{
        	System.out.println("no is not armstrong");
        }
	}
}
