package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

		static void kadaiA() {

			for(int i = 1; i <= 10; i++) {
				System.out.println("現在" + i + "回目のループです。");
			}
		}

		static void kadaiB() {
	//ここに課題を書く。メソッド名変えてね。
			Random random = new Random();
			int i = random.nextInt(100);
			System.out.println(i + 1 + "が出ました。");

		}

}