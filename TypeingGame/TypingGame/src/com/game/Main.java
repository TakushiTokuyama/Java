package com.game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

class Main {

	public static void main(String[] args) {
		// 開始
		System.out.println("Start");

		// モード選択
		System.out.println("モード選択");
		System.out.println("1:タイピング   2:成績");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String modeSelect = null;

		try {
			modeSelect = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (modeSelect == "2") {
			// 成績
		}

		// タイピングの説明

		// 問題数
		int count = 0;

		// 問題ループ開始
		while (true) {
			Random r = new Random();

			String problem = Problem.javaLang[r.nextInt(10)];

			System.out.println("問題");
			System.out.println(problem);

			String answer = null;
			try {
				answer = br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			if (answer.equals(problem)) {
				// 正解
				System.out.println("正解");
			} else {
				// 不正解
				System.out.println("不正解");
			}

			count++;

			// 終了判定
			if (count >= 5) {
				// 問題ループ終了
				break;
			}
		}

		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 成績発表

		System.out.println("Finish");
	}

}