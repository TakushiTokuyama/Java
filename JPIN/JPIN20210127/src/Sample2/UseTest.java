package Sample2;

import Sample.SampleException;

public class UseTest {

	public static void main(String[] args)throws TestException  {
		// TODO 自動生成されたメソッド・スタブ
		Test t = new Test();
		try {
			t.excute(-1);
			System.out.println("safe");
		} catch (SampleException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
		try {
			new B().Test();
		} catch (Sample2.SampleException e) {
			// TODO 自動生成された catch ブロック
			throw new TestException();
		}
	}
}
