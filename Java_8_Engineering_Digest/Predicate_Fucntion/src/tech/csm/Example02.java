package tech.csm;

import java.util.function.Predicate;

public class Example02 {
	public static void main(String[] args) {
		Predicate<Integer> salaryGreaterThanOneLac = x -> x > 100000;
		System.out.println(salaryGreaterThanOneLac.test(20000));
	}

}
