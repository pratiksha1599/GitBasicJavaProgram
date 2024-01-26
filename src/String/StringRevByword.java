package String;

public class StringRevByword {
public static void main(String[] args) {
	String str = "My name is Mayur";
	String res="";
	String ar[]=str.split(" ");
	for(int i=ar.length-1;i>=0;i--) {
		res=res+" "+ar[i];
	}
	System.out.println(res);
}
}
