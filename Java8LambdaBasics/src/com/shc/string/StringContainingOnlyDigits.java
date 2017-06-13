package com.shc.string;

import java.util.Scanner;

public class StringContainingOnlyDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String next = sc.next();
		if (checkForDigits(next)) {
			System.out.println("Valid String");
		} else {
			System.out.println("Sorry");
		}
	}

	public static boolean checkForDigits(String str) {
        char[] ch = str.toCharArray();
		return !str.contains("a-z||A-Z") ? true : false;
	}

}
