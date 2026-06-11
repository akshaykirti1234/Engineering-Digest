package tech.csm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Akshay", "Subrat", "Subham", "Somanath", "Sarat");
		List<Student> students = names.stream().map(Student::new).collect(Collectors.toList());

		System.out.println(students);
	}

}
