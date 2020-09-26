package operator;

public class OperatorDemo {
	

	public static void main(String[] args) {
		int a=10;
		int b=10;
		int c;
		//increment
		c=a++;
		System.out.println(c);//10
		System.out.println(a);//11// latest value
		c=++a;
		System.out.println(c);//12
		System.out.println(a);//12
		System.out.println(++b);//11
		b++;
		System.out.println(b);//12 latest value
		

	}

}
