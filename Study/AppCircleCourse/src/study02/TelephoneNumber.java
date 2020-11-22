package study02;

import java.util.ArrayList;
import java.util.List;

public class TelephoneNumber implements Find, Update, Delete{

	private List<String> telephoneNumberList = new ArrayList<String>() {
		{
			add("00011232345");
			add("00023241234");
			add("00021341413");
		}
	};

	// 一件検索
	@Override
	public String FindOne() {
		return this.telephoneNumberList.get(0);
	}

	// 全件検索
	@Override
	public List<String> FindAll() {
		return this.telephoneNumberList;
	}

	// 一件削除
	@Override
	public List<String> DeleteOne() {
		this.telephoneNumberList.remove(0);
		return telephoneNumberList;
	}

	// 全件削除
	@Override
	public List<String> DeleteAll() {
		this.telephoneNumberList.clear();
		return telephoneNumberList;
	}

	// 一件更新
	@Override
	public List<String> UpdateOne(String telephoneNumber) {
		telephoneNumberList.set(0, telephoneNumber);
		return telephoneNumberList;
	}

	// 全件更新
	@Override
	public List<String> UpdateAll(List<String> telephoneNumberList) {
		this.telephoneNumberList = telephoneNumberList;
		return this.telephoneNumberList;
	}

}
