package tech.csm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(5);
		list.add(8);
		list.add(1);
		list.add(3);

		// To sort in descending order we need to implement the comparator interface
		Collections.sort(list, (e1, e2) -> e2 - e1);

		System.out.println(list);

	}
}
