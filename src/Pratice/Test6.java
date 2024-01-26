package Pratice;

 abstract class Ex_Abstarction {

	// abstct class allow both abstact and non abstarct methods
	 //0 -100%
	abstract void car(); 
	
	public void add() {
		System.out.println("addition of two no.");
	}



}


 class vechicle extends Ex_Abstarction{

	@Override
	void car() {
		System.out.println("car is blue");
		
	}
	void sum() {
		System.out.println("sum of elements");
	}
	
 }
 
 class Test6{
 
	public static void main(String[] args) {
		Ex_Abstarction eobj = new vechicle();
		eobj.add();
		eobj.car();
	}
}


