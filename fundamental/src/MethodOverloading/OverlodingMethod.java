package MethodOverloading;

public class OverlodingMethod {
	int a, b;
	void calc(int x){
		a=x;
		System.out.println("square is" + (a*a));
	}
	void calc(int x,int y) {
		a=x;
		b=y;
		System.out.println("addition is" + (a+b));
	}
	void calc(int x,int y, int z) {
		a=x;
		b=(x+y)/z;
		System.out.println("result is" + b);
	}

	public static void main(String[] args) {
		OverlodingMethod m1= new OverlodingMethod (); 
		m1.calc(10);
		m1.calc(10, 20);
		m1.calc(10, 10, 5);
		
	}

}
