package Hello;

public class Sample01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Customer Toku = new Customer(1, "Toku");
		Customer Kobori = new Customer(2, "Kobori");

		Company company = new Company("RaiseTech", Toku);

		System.out.println(Toku.getId());
		System.out.println(Toku.getName());
		System.out.println(Kobori.getId());
		System.out.println(Kobori.getName());

		System.out.println(company.getCompanyName());
		System.out.println(company.getCustomer().getName());
	}

}
