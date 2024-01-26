package Array;

public class RevStringEx {
	public static void main(String[] args) {
		String str="sai swami samrtha";
		String ar[]=str.split(" ");
		
		String r="";
		for(int i=ar.length-1;i>=0;i--) {
		r=	r+" "+ar[i];
		}
	System.out.println(r);
	
	}
}
