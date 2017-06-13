package com.shc.string;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Harleen";
		String str2 = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			str2 = str2 + str.charAt(i);
		}
		System.out.println("reverse of string is :" + str2);
	}

}
