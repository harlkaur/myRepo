package com.shc.hackerrank;

import java.util.Scanner;

public class ExceptionHandlingPowerProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			MyCalculator myCalculator = new MyCalculator();
			try {
				System.out.println(myCalculator.power(n, p));
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}

}

class MyCalculator {

	public int power(int n, int p) throws Exception {
		int res = 0;
		if ((n < 0) || (p < 0)) {
			throw new Exception("n and p should be non-negative");
		}
		res = (int) Math.pow(n, p);
		return res;
	}
}
