package study02;

import java.util.ArrayList;
import java.util.List;

public class TelephoneNumber implements Find, Delete{

	private List<String> telephoneNumberList = new ArrayList<String>() {
		{
			add("09011232345");
			add("09023241234");
			add("09021341413");
		}
	};

	@Override
	public String FindOne() {
		return this.telephoneNumberList.get(0);
	}

	@Override
	public List<String> FindAll() {
		return this.telephoneNumberList;
	}

	@Override
	public List<String> DeleteOne() {
		this.telephoneNumberList.remove(0);
		return telephoneNumberList;
	}

	@Override
	public List<String> DeleteAll() {
		this.telephoneNumberList.clear();
		return telephoneNumberList;
	}

}
