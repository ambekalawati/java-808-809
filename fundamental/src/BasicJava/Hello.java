package BasicJava;

public class Hello {

	public void m1(int x, int y) {
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		Hello obj = new Hello();
		System.out.println("output is" );
		obj.m1(10, 20);
		
		

	}

}
