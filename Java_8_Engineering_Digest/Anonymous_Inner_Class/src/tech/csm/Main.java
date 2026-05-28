package tech.csm;

public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee() {

			@Override
			public Double getSalary() {
				return 10.00;
			}

			@Override
			public String getDesignation() {
				return "Software Engineer";
			}
		};

		System.out.println(employee.getDesignation());
		System.out.println(employee.getSalary());
	}
}
