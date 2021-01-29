
public class Order {
	private Item item;
	private int qty;

	public int getTotal() {
		return this.qty * item.getPrice();
	}

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
}
