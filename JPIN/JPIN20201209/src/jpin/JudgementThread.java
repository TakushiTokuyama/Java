package jpin;

import java.util.Random;

public class JudgementThread extends Thread {

	public void run() {

		Random ran = new Random();
		int score = ran.nextInt(250) - 100;

		if (score > 100) {
			System.out.println(getName() + "１００点より大きい");
		} else if (score < 0) {
			System.out.println(getName() + "０点より小さい");
		} else {
			System.out.println(getName() + "正常");
		}
	}
}