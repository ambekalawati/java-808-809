package exceptionhandling;

public class ExceptionDemo {
	 int a=10;
	 int m1(){
		try {
			a++;
		System.out.println(10/0);
		a++;
		return a;
		}
		catch(ArithmeticException e) {
			System.out.println(a++);
			System.exit(0);
			return a;
		}
		finally {
			System.out.println(a++);
			a=a+1;
			//return a;
		}
	
		
	}
	public static void main(String[] args) {
		ExceptionDemo ad= new ExceptionDemo();
		int b=ad.m1();
		
		
		System.out.println(b);
		
	}

}
