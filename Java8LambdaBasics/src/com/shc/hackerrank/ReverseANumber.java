package com.shc.hackerrank;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 485734573;
		int result = reverse(num);
		System.out.println(result);
	}

	private static int reverse(int no) {
		int pow = 0;
		while(no > 0 ){
		int res = no % 10;
	    pow = pow * 10 + res;
		no = no / 10;
		}
		return pow;
	}
}
