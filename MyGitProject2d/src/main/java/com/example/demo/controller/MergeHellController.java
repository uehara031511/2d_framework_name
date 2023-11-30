package com.example.demo.controller;

import java.util.Random;

public class MergeHellController {
	public static void main(String[] args) {
		kadaiA();
		kadaiB();
	}

		static void kadaiB() {
	//ここに課題を書く。メソッド名変えてね。
			Random random = new Random();
			int i = random.nextInt(100);
			System.out.println(i + "が出ました。");
			
		}
}