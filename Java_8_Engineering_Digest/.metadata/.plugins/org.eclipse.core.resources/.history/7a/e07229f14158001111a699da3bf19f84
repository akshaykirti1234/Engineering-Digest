package tech.csm;

import java.util.Arrays;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9);
		int sum = numbers.stream().filter(ele -> ele % 2 == 0).mapToInt(n -> n).sum();
		System.out.println(sum);
	}
}
