
public class Sample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[3];

		array[0] = 10;
		array[1] = 20;
		array[2] = 30;

		int[] array2 = array;
		array2[0] = 100;

		for (int i : array) {
			System.out.println(i);
		}

		for (int i : array2) {
			System.out.println(i);
		}

		A[] array3 = new A[3];

		array3[0] = new A();
		array3[1] = new A("siga");

		for (A a : array3) {
			System.out.println(a);
		}
	}

	public static class A {
		A() {
			System.out.println("Hello");
		}

		A(String name) {
			System.out.println("Hello" + " " + name);
		}
	}
}
