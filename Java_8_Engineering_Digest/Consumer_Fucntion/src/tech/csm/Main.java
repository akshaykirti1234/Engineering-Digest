package tech.csm;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
	public static void main(String[] args) {
		Consumer<String> consumer = s -> System.out.println(s);

		Consumer<List<Integer>> consumer2 = list -> {
			for (Integer x : list) {
				System.out.println(x + 100);
			}
		};

		consumer.accept("akshay"); // akshay
		consumer2.accept(Arrays.asList(1, 2, 3, 4, 5)); // 100,200,300,400,500
	}
}
