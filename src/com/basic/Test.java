package com.basic;

 class Bike {
	void run() {
		System.out.println("vehicle is running");
	}

}

class Hero extends Bike {
	void run() {
		System.out.println("Hero is running");
	}
}

class Test{
	public static void main(String[] args) {
		Hero bobj = new Hero();
		bobj.run();
		
		Bike b = new Hero(); 
		b.run();
		
	  
	    
	}
}
