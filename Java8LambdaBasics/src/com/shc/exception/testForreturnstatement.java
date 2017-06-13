package com.shc.exception;

public class testForreturnstatement {

	public static void main(String[] args) {
		int result = test();
		System.out.println(result);
	}

	private static int test() {
		try {
			return 1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return 3;
		}
	}

}
