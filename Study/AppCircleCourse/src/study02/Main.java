package study02;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		TelephoneNumber telephoneNumber = new TelephoneNumber();
		Place place = new Place();

		// 検索
		System.out.println("一件検索" + ":" + telephoneNumber.FindOne());
		System.out.println("全件検索" + ":" + telephoneNumber.FindAll());

		System.out.println("一件検索" + ":" + place.FindOne());
		System.out.println("全件検索" + ":" +place.FindAll());

		List<String> telephoneNumberList = new ArrayList<String>()
		{
			{
				add("111111111");
				add("222222222");
				add("333333333");
			}
		};

		List<String> placeList = new ArrayList<String>()
		{
			{
				add("愛媛");
				add("北海道");
				add("沖縄");
			}
		};

		// 更新
		System.out.println("一件更新" + ":" + telephoneNumber.UpdateOne("000000000"));
		System.out.println("全件更新" + ":" + telephoneNumber.UpdateAll(telephoneNumberList));

		System.out.println("一件更新" + ":" + place.UpdateOne("福岡"));
		System.out.println("全件更新" + ":" + place.UpdateAll(placeList));

		// 削除
		System.out.println("一件削除" + ":" + telephoneNumber.DeleteOne());
		System.out.println("全件削除" + ":" + telephoneNumber.DeleteAll());

		System.out.println("一件削除" + ":" +place.DeleteOne());
		System.out.println("全件削除" + ":" +place.DeleteAll());
	}
}