package Constructor;

public class Student {
	int a;
	int b;
	Student(){
		System.out.println("default constructor");
	 a= 10;
	 b= 20;
	}
	void disp() {
		System.out.println("value of a is=" + a);
		System.out.println("value is b is=" + b);
	}

	public static void main(String[] args) {
		Student obj = new Student() ;
			obj.disp();
		

	}

}
