package javaLearning_point;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		System.out.println("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println(num + "is a Prime Number");
		} else {
			System.out.println(num + "is not a Prime Number");
		}

	}

}
