package keyword_this_super_static;



 class D{
  void m1() {
	  System.out.println("m1-A");
	  m2();
	  this.m2();
	  this.m3();
  }
  
  void m2() {
	  System.out.println("m2-A");
	  
  }
  void m3() {
	  System.out.println("m3-A");
  }

}
public class Test2 {
	public static void main(String[] args) {
     D a = new D();
     a.m1();
	}
}
