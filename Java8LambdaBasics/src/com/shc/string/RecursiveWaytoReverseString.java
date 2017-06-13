package com.shc.string;

public class RecursiveWaytoReverseString {

	public static void main(String[] args) {
		String str = "Harleen Kaur";
		System.out.println(recursiveString(str));
	}

	public static String recursiveString(String str) {
		if (str.length() < 2) {
			return str;
		}

		return recursiveString(str.substring(1)) + str.charAt(0);
	}
}
