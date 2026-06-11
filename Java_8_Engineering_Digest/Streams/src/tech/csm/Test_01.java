package tech.csm;

import java.util.Arrays;

public class Test_01 {
	public static void main(String[] args) {

		// Imperative approach
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				sum += arr[i];
			}
		}
		System.out.println(sum);

		// Declarative approach (Stream)
		int[] arr2 = { 1, 2, 3, 4, 5, 6 };
		int sum2 = Arrays.stream(arr2).filter(n -> n % 2 == 0).sum();
		System.out.println(sum2);
	}
}
