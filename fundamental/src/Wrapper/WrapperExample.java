package Wrapper;

public class WrapperExample {
	

	public static void main(String[] args) {
		int x=1;
		int y= new WrapperExample().change(x);
		System.out.println(x+y);
		
		

	}
	int change(int x) {
		x=2;
		return x;
	}

}
