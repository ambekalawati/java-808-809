package operator;

public class OperatorDemo2 {

	public static void main(String[] args) {
		int a=4;
		int b;
		//b=++(++a);//b=++(11) note- we can not apply increment or decrement operator on constant value.
		a++;
		System.out.println(a);//5
		byte x=5;
		x++;
		//x=x+1;// max(int,typeof a,typeof b) i.e, max(int,byte,int)=>int	
		//System.out.println(10/0);// java.lang.ArithmeticException: / by zero
		System.out.println(10/0.0);
		System.out.println(-10/0.0);
		System.out.println(0/0);// java.lang.ArithmeticException: / by zero
		System.out.println(0.0/0);//concatination next topic
	}

}

