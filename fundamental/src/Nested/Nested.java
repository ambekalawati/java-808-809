package Nested;

public class Nested {
	public static void main(String[] args) {
		int n1=30;
		int n2=20;
		int n3=10;
		if(n1>n2)
		{
			if(n1>n3) {
				System.out.println("largest value is n1");
			}
			else
			{
				System.out.println("largest value is not n1");
			}
		}
		else {
			if(n2>n1) {
				System.out.println("largest number is n2");
			}
			else {
				System.out.println("largest value is not n2");
			}
		}
			System.out.println("smaller value is n3");
			
		

	}


}
