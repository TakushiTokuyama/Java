
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Item item = new Item();
		item.setName("apple");
		item.setPrice(100);

		Order order = new Order();
		order.setQty(3);
		order.setItem(item);
		int result = order.getTotal();

		System.out.println(result);
	}

}
