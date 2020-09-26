package BasicJava;

public class Addition {
	int a=10;
	int b=20;
	int c=a+b;
	public void m1() {
		System.out.println("output is:" +c);
	}
	public void m2() {
		System.out.println("result is:" +(a-b));
	}

	public static void main(String[] args) {
		Addition obj= new Addition();
		obj.m1();
		obj.m2();
		
		

	}

}
