package fundamental;

import java.util.Scanner;

public class VarArg {
	public static void m1(int...a) {
		System.out.println(a);
	}
	public static void m2(int a) {
		System.out.println(a);
	}
	public static void m3(int a,char b, long...l) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		VarArg.m1(10);
		VarArg.m1(10,20);
		VarArg.m1(10,20,30);
		VarArg.m2(40);
		VarArg.m1();
		// TODO Auto-generated method stub
		Scanner sr= new Scanner(System.in);
		System.out.println("enter your name");
		String nextLine = sr.nextLine();
		System.out.println("your name is "+nextLine);


	}

}
