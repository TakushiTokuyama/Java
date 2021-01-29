import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Order> orderList = new ArrayList<Order>();
	private int totalPrice;

	public void setOrder(Order order) {
		this.orderList.add(order);
	}

	public int getTotal() {
		for (Order order : this.orderList) {
			this.totalPrice += order.getFruit().getPrice() * order.getNum();
		}
		return this.totalPrice;
	}
}
