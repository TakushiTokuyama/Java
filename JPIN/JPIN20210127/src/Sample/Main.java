package Sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		int total = 0;

		System.out.println("> ");

		//		while (true) {
		//			try {
		//				while ((line = in.readLine()) != null) {
		//
		//					total += Integer.parseInt(line);
		//					System.out.println("> ");
		//					System.out.println(total);
		//				}
		//			} catch (NumberFormatException | IOException e) {
		//				// TODO 自動生成された catch ブロック
		//				e.printStackTrace();
		//			}
		//		}

		try {
			while ((line = in.readLine()) != null) {

				try {
				total += Integer.parseInt(line);
				System.out.println("> ");

				if(Integer.parseInt(line) == 0) {
					break;
				}
				}catch(NumberFormatException e) {
					System.out.println("invalid number");
				}

			}
		} catch (NumberFormatException | IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		System.out.println(total);
	}

}
