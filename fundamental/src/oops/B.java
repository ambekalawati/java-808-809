package oops;

public class B extends A {
	int a=10;
	public int m1(Object s)
	{
		System.out.println("child");
		return 0;
		
		
	}

	public static void main(String[] args) {
		A a= new B();
		/*B b=(B)new A();
		A a1=new A();
		B b1=(B)a1;*/
		a.m1("kalawati");

	}

}

