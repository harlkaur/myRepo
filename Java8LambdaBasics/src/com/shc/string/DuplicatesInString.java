package com.shc.string;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicatesInString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int count = 0;
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (char c : input.toCharArray()) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
				count++;
			} else {
				map.put(c, 1);
			}
			if (count > 0) {
				System.out.println("duplicate elements are :" + c);
			}
		}

	}
}
