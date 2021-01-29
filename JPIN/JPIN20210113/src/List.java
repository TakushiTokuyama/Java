
public class List {
	private String value;
	private int index;
	private List next;

	List(){
		this.value = null;
		this.index = 0;
		this.next = null;
	}

	private List(int index){
		this();
		this.index = index;
	}

	public void add(String value) {
		if(this.value == null) {
			this.value = value;
			return;
		}

		if(this.next == null) {
			this.next = new List(1 + index);
		}

		this.next.add(value);
	}

	public String get(int index) {
		return this.value;
	}

	public int size() {
		return this.index;
	}

}
