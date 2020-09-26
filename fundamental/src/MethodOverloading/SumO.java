package MethodOverloading;

public class SumO {
	public int SumO(int a, int b)
	{
		return(a+b);
	}
	public int SumO(int a, int b, int c)
	{
		return(a+b+c);
	}
	public double SumO(double a, double b)
	{
		return(a+b);
	}
	public static void main(String[] args) {
		SumO s=new SumO();
		System.out.println(s.SumO(10, 20));
		System.out.println(s.SumO(10,20, 30));
		System.out.println(s.SumO(10.1,10.2));
	}

}
