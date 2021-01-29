
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		try {
			//int[] array = new int[0];
			//array[0] = 10;
			//A a = null;
			//a.hello();

			int result = Integer.parseInt("a");
			System.out.println(result);

//		} catch (ArrayIndexOutOfBoundsException ex) {
//			System.out.println("troble");
//		} catch(NullPointerException ex)
//		{
//			System.out.println("nullpo");
//		}
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException ex) {
			System.out.println("troble");
		}catch(NumberFormatException ex)
		{
			System.out.println("number exception");
		}
		System.out.println("hello");
	}

}
