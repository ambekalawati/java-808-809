package library;

public class StringDemo {
	
 public static void main(String[] args) {
	 char arr []= {'T','u','l','s','i'};
	 String s="";
	 for(int i=0; i<5;i++ ) {
		s=s+arr[i];
		
	 }
	// System.out.print(s);
	 String a= new String(arr);
	 System.out.println(a);
 } 
 
}
