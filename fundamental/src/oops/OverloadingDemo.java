package oops;

public class OverloadingDemo {
	public void m1(){
		System.out.println("no argument");
	}
	public void m1(int a){
		System.out.println("one argument type int");
	}
	public void m1(int a,int b,int c){
		System.out.println("three argument type int");
	}
	public void m1(double b, double d){
		System.out.println("two argument type double, double");
	}
	public void m1(double d, int b){
		System.out.println("two argument type double,int");
	}
	public void m1(float d, int b){
		System.out.println("two argument type float,int");
	}
	/*public void m1(long d, int b){
		System.out.println("two argument type long,int");
	}*/
	public void m1(char z){
		System.out.println("one argument type char");
	}
	public void m1(String s){
		System.out.println("one argument type String");
	}

	public static void main(String[] args) {
     OverloadingDemo a=new OverloadingDemo();
     a.m1(10,10);
     
		

	}

}
