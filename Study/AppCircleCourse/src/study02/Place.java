package study02;

import java.util.ArrayList;
import java.util.List;

public class Place implements Find, Update, Delete{

	private List<String> placeList = new ArrayList<String>() {
		{
			add("兵庫");
			add("大阪");
			add("京都");
		}
	};

	// 一件検索
	@Override
	public String FindOne() {
		return this.placeList.get(0);
	}

	// 全件検索
	@Override
	public List<String> FindAll() {
		return this.placeList;
	}

	// 一件削除
	@Override
	public List<String> DeleteOne() {
		placeList.remove(0);
		return placeList;
	}

	// 全件削除
	@Override
	public List<String> DeleteAll() {
		placeList.clear();
		return placeList;
	}

	// 一件更新
	@Override
	public List<String> UpdateOne(String place) {
		placeList.set(0, place);
		return placeList;
	}

	// 全件更新
	@Override
	public List<String> UpdateAll(List<String> placeList) {
		this.placeList = placeList;
		return this.placeList;
	}
}
