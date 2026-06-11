package tech.csm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
	public static void main(String[] args) {

		List<String> myList = Arrays.asList("apple", "banana", "cherry");
		Stream<String> stream = myList.stream();

		int[] intArray = { 1, 2, 3, 4, 5 };
		IntStream stream2 = Arrays.stream(intArray);

		String[] strArray = { "apple", "banana", "mango" };
		Stream<String> stream3 = Arrays.stream(strArray);

		Stream<Integer> stream4 = Stream.of(1, 2, 3);

		Stream<Integer> stream5 = Stream.iterate(0, n -> n + 1).limit(10);

		Stream<Integer> stream6 = Stream.generate(() -> (int) (Math.random() * 100)).limit(10);
		System.out.println(stream6.toList());
	}
}
