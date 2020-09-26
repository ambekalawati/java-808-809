package oops;

public class Child extends Parent{ 
	private int a=10;
	
	 static {
		 
			System.out.println("static block is loading");  
		  }
	static int age= m3();
 
	int b=10;
	{
		int a=20;
		System.out.println(a);
		
	}
	public Child()
	{
		super();
		System.out.println("child constructor");
		 
		//System.out.println(super.getClass().getName());
	}
	public static int m3() {
		System.out.println("m3 method is loading");
		return 14;
	}
	public void m2() {
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		Child child =new Child();
	//	Parent p = new Parent();
	}

}
