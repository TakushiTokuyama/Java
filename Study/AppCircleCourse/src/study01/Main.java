package study01;

public class Main {

	public static void main(String[] args) {
		Employee A = new Employee(1, "A");

		Company company = new Company("KAISYA", A);

		System.out.println(company.getCompanyName());
		System.out.println(company.getCustomer().getName());
	}
}