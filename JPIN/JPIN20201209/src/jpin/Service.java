package jpin;

import java.util.Scanner;

public class Service {

	public void judge() {
		Scanner scan = new Scanner(System.in);

		int score = scan.nextInt();

		if (score > 100) {
			System.out.println("１００点より大きい");
		}

		if (score < 0) {
			System.out.println("０点より小さい");
		}

		scan.close();
	}

	public void Shignal() {
		Boolean flag = true;
		int time = 10;

		while (flag) {
			if (time > 7) {
				System.out.println("青");
			} else if (time > 4) {
				System.out.println("黄");
			} else if (time > 0) {
				System.out.println("赤");
			} else {
				flag = false;
			}
			time--;
		}

		int a = 1;
		while (a < 10) {
			System.out.println("hello");
			a++;
			if (a % 2 == 0) {
				break;
			}
		}
	}

	public void arrayService()
	{
		int[] array = { 10, 20, 30 };

		for(int num : array)
		{
			System.out.println(num);
		}
	}

}
