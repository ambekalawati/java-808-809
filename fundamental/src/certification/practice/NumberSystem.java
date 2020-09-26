package certification.practice;

public class NumberSystem {

	public static void main(String[] args) {
//		octal Number(0-7)
		int octal = 07;
		int firstOctal = 011;
		int secondOctal = 022;
		int decimalSum = firstOctal + secondOctal;
		System.out.println("decimalValue= " + octal);

		System.out.println("decimalSum= " + decimalSum + " " + "octalSum= " + Integer.toOctalString(decimalSum));
//	HexaDecimal Number(0-9 & A to F)
		int hexa = 0X78;
		int hexaOne = 0X123;
		int hexaTwo = 0x12345;
		int sum = hexaOne + hexaTwo;
		System.out.println("DecimalSum= " + sum + " " + "HexaDecimal= " + Integer.toHexString(sum));
		System.out.println("Hexa= " + hexa);
//		Binary Number(0-1)
		int binary = 0b1001;
		int binaryOne = 0B111;
		int sum1 = binary + binaryOne;
		System.out.println("Binary= " + binary);
		System.out.println("BinarySum= " + (binary + binaryOne) + " " + Integer.toBinaryString(sum1));
//		double Scientific & HexPi
		double myDouble = 2.55F;
		double scientific = 5.00134E03;
		System.out.println("ScientificNotation= " + scientific);
		System.out.println(myDouble);
	}

}
