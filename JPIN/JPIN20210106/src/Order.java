
public class Order {
	private Fruit fruit;
	private int num;

	Order(Fruit fruit, int num){
		this.fruit = fruit;
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public Fruit getFruit() {
		return fruit;
	}

	public void setFruit(Fruit fruit) {
		this.fruit = fruit;
	}
}
