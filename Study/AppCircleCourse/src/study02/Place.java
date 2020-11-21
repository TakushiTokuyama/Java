package study02;

import java.util.ArrayList;
import java.util.List;

public class Place implements Find, Delete{

	private List<String> placeList = new ArrayList<String>() {
		{
			add("兵庫");
			add("大阪");
			add("京都");
		}
	};

	@Override
	public String FindOne() {
		return this.placeList.get(0);
	}

	@Override
	public List<String> FindAll() {
		return this.placeList;
	}

	@Override
	public List<String> DeleteOne() {
		placeList.remove(0);
		return placeList;
	}

	@Override
	public List<String> DeleteAll() {
		placeList.clear();
		return placeList;
	}
}
