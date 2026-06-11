package tech.csm;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Main {
	public static void main(String[] args) {
		// BiPredicte
		BiPredicate<String, Integer> biPredicate = (x, y) -> x.length() == y;
		System.out.println(biPredicate.test("akshay", 6)); // true

		// BiFunction
		BiFunction<String, String, Integer> biFunction = (x, y) -> x.concat(y).length();
		System.out.println(biFunction.apply("akshay", "kirti")); // 11

		// BiConsumer
		BiConsumer<String, String> biConsumer = (x, y) -> System.out.println(x.concat(y));
		biConsumer.accept("akshay", "kirti"); // akshaykirti
	}
}
