package tech.csm;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class Main {
	public static void main(String[] args) {
		UnaryOperator<Integer> unaryOperator = (x) -> x * 2;
		System.out.println(unaryOperator.apply(3));

		BinaryOperator<String> binaryOperator = (x, y) -> x + y;
		System.out.println(binaryOperator.apply("Akshay", "kirti"));
	}
}
