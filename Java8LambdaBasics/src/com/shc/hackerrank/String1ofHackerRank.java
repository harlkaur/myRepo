package com.shc.hackerrank;

import java.util.Scanner;

public class String1ofHackerRank {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();

		System.out.println(s1.length() + s2.length());
		int res = s1.compareTo(s2);
		if (res > 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		System.out.println(
				s1.charAt(0) + s1.substring(1).toLowerCase() + " " + s2.charAt(0) + s2.substring(1).toLowerCase());
	}

}
