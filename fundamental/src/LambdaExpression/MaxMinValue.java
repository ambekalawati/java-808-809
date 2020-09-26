package LambdaExpression;

public class MaxMinValue {

	public static void main(String[] args) {
		int[] array = { 40, 30, 90, 10, 80, 70, 20 };
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Maximum value is:" + max);
		int min = array[0];
		for (int j = 1; j < array.length; j++) {
			if (array[j] < min) {
				min = array[j];
			}
		}
		System.out.println("Minimum value is:" + min);
	}

}
