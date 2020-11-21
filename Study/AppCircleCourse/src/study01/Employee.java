package study01;

public class Employee {
	// フィールド
	private int id;
	private String name;

	// コンストラクタ
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	// getter
	public int getId() {
		return this.id;
	}

	// setter
	public void setId(int id) {
		this.id = id;
	}

	// getter
	public String getName() {
		return this.name;
	}

	// setter
	public void setId(String name) {
		this.name = name;
	}

}
