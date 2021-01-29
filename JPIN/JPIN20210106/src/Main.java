
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// フルーツ
		Fruit apple = new Fruit("Apple", 100);
		Fruit orange = new Fruit("Orange", 120);
		Fruit banana = new Fruit("Banana", 150);

		// 注文
		Order appleOrder = new Order(apple, 3);
		Order orangeOrder = new Order(orange, 1);
		Order bananaOrder = new Order(banana, 2);

		// カート
		ShoppingCart shoppingCart = new ShoppingCart();

		shoppingCart.setOrder(appleOrder);
		shoppingCart.setOrder(orangeOrder);
		shoppingCart.setOrder(bananaOrder);

		System.out.println(shoppingCart.getTotal());

		List list = new List();
		list.add("A");
		list.add("B");
		list.add("C");

		for(int i =0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		Hoge.hello();
	}
}
