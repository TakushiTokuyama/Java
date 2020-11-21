package study01;

public class Company {

	public String companyName;

	public Employee customer;

	Company(String companyName, Employee customer) {
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
	public Employee getCustomer() {
		return this.customer;
	}

	// setter
	public void setCustomer(Employee customer) {
		this.customer = customer;
	}
}
