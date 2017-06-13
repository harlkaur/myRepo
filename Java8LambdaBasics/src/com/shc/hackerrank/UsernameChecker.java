package com.shc.hackerrank;

import java.util.Scanner;

public class UsernameChecker {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		String[] s = new String[no];
		for (int i = 0; i < s.length; i++) {
			s[i] = sc.next();
		}
		for (String str : s) {
			int flag = 0;
			char c = str.charAt(0);
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				if (str.matches("[A-Za-z]+") || str.contains("_")) {
					flag = 1;
				}
			}
			if (flag == 1) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
		}
	}
}
