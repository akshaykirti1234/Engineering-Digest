package tech.csm;

import java.util.function.Predicate;

public class Example03 {
	public static void main(String[] args) {
		Predicate<String> nameStartswithA = name -> name.toLowerCase().charAt(0) == 'a';
		System.out.println(nameStartswithA.test("Akshay"));
	}
}