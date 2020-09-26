
public class MethodO {
	public double MethodO(double a,double b) {
		return(a+b);
	}
	public double MethodO(double a, double b, double c) {
		return(a+b+c);
	}
	public static void main(String[] args) {
		MethodO m= new MethodO();
		System.out.println(m.MethodO(12.1,15.5 ));
        System.out.println(m.MethodO(11.1,12.1,13.1));
	}

}
