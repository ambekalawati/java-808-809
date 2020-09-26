package generalPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		int temp = num;
		int f = 1;
		for (int i = 1; i < temp; i++) {
			f = f * i;
		}
		System.out.println(f);
	}

}
