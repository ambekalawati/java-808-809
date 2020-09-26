package exceptionhandling;

public class Solution {
	 public static void print() {
		  int a=10;
		  int b=0;
		  try {
		  System.out.println(a/b);
		  }catch(ArithmeticException e) {
		   System.out.println("Denominator must not be zero");
		  }
		 }
		 public static void main(String[] args) {
		  print();
		 }

}
