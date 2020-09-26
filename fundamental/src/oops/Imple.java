package oops;

import java.io.FileNotFoundException;

public class Imple implements InterF {
	final int b=20;
	
	void m8() {
		//b=30;
		System.out.println("m8");
	}
	
	public static void main(String[] args) {
		int result =InterF.a;
		System.out.println(result);
		InterF.m6();
		Imple obj= new Imple();
		obj.m8();
		
		
		
	}

	@Override
	public void m2()throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
