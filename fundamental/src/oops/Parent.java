package oops;

public class Parent {
	static int salary= m4();
	static {
		System.out.println("parent static block is loading");
	}
	int c= m5();
int a=40;
{
	System.out.println(a);
	}
public Parent() {
	super();
	System.out.println("parent constructor");
}
 private int m5() {
	 System.out.println("m5 method ");
	return 50;
}
private static int m4() {
	 System.out.println("m4 is loading");
	return 4000;
}
public void m1()
 {
	 System.out.println("m1");
 }
}
