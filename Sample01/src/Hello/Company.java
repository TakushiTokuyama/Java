package Hello;

public class Company {

	public String companyName;

	public Customer customer;

	Company(String companyName, Customer customer) {
		this.companyName = companyName;
		this.customer = customer;
	}

	// getter
	public String getCompanyName() {
		return this.companyName;
	}

	// setter
	public void setId(String companyName) {
		this.companyName = companyName;
	}

	// getter
	public Customer getCustomer() {
		return this.customer;
	}

	// setter
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}
