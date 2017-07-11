package com.shc.ibm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AlternateUpperandLower {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Please enter the string");
			String str = br.readLine();
			StringBuffer result = alternateCase(str);
			System.out.println("Alternating the cases in the given string: " + result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static StringBuffer alternateCase(String s) {
		boolean caseSensitivity = false;
		char firstChar = s.charAt(0);
		StringBuffer sb = new StringBuffer();
		if (Character.isUpperCase(firstChar)) {
			caseSensitivity = true;
			sb.append(firstChar);
		} else {
			firstChar = Character.toUpperCase(firstChar);
			sb.append(firstChar);
			caseSensitivity = true;
		}

		for (int i = 1; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				if (caseSensitivity) {
					sb.append(Character.toLowerCase(s.charAt(i)));
					caseSensitivity = false;
				} else if (!caseSensitivity) {
					sb.append(Character.toUpperCase(s.charAt(i)));
					caseSensitivity = true;
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		return sb;

	}
}
