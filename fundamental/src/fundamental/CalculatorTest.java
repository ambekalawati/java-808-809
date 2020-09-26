package fundamental;
public class CalculatorTest {

	public  static Calculator getInstance() {
		return new Calculator();
	}
	public static void main(String[] args) {
//		Calculator calculate=new Calculator();
//	int addedValue=	calculate.add(10,40);
//	System.out.println(addedValue);
//	System.out.println(calculate.subtract(40, 30));
		Calculator cal=	getInstance();
	int result=	cal.add(20, 30);
	System.out.println(result);
	}
}
