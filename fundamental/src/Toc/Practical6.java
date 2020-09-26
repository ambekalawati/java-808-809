package Toc;

import java.util.Scanner;

public class Practical6 {
	String str;

	int len;
	int stack;

	void intial() {

		System.out.println("Welcome");
		// System.out.println("To stop the program type exit");
		System.out.println("0's OR 1's");
		Scanner obj = new Scanner(System.in);
		str = obj.nextLine();
		if (str.equals("exit")) {
			System.exit(0);
		}
		len = str.length();
		if (len > 0) {
			for (int i = 0; i < str.length(); i++) {
				char b1 = str.charAt(i);
				if (b1 == '1' || b1 == '0') {

				} else {
					System.out.println("please provide valid string");
					intial();
				}

			}
			first();

		}

	}

	void first() {
		int counter1 = 0;
		int counter0 = 0;
		len = str.length();
		if (len > 0) {
			for (int i = 0; i < len; i++) {
				char a1 = str.charAt(i);
				if (a1 == '1') {
					counter1++;
				} else {
					counter0++;
				}

			}
		}
		System.out.println("Number of 1 in given string:" + counter1);
		System.out.println("Number of 0 in given string:" + counter0);
		intial();

	}

	public static void main(String[] args) {
		Practical6 p6 = new Practical6();
		p6.intial();

	}

}
