package com.shc.oops;

public class Fibonacci {

	public static void main(String[] args) {

		//int fb = 15;
		int[] fCnt = new int[10];
		fCnt[0] = 0;
		fCnt[1] = 1;
		for (int i = 2; i < fCnt.length - 1; i++) {
			fCnt[i] = fCnt[i - 1] + fCnt[i - 2];
		}
		for (int j = 0; j < fCnt.length - 1; j++) {
			System.out.println(fCnt[j]);
		}
	}

}
