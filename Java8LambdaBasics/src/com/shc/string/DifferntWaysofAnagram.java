package com.shc.string;

import java.util.Arrays;
import java.util.Scanner;

public class DifferntWaysofAnagram {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String next1 = sc.next();
		String next2 = sc.next();
		char[] c1 = next1.toCharArray();
		char[] c2 = next2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);*/
		
		/*if(Arrays.equals(c1, c2)){
			System.out.println("String are anagrams!!!");
		}else{
			System.out.println("Sorry");
		}*/
		
		/*int count = 0;
		int length = c1.length;
		if (c2.length == length) {
			for (int i = 0; i < length; i++) {
				if (c1[i] == c2[i]) {
					count++;
				}
			}
			if (count == length) {
				System.out.println("String are anagrams!!!");
			}
		}else{
			System.out.println("Sorry");
		}*/
		
		if(checkAnagram("anagram","anagra")){
			System.out.println("String are anagrams!!!");
		}else{
			System.out.println("Sorry");
		}
	}
	
	public static boolean checkAnagram(String first, String second) {
		char[] ch = first.toCharArray();
		StringBuilder sb = new StringBuilder(second);
		for (char c1 : ch) {
			int index = sb.indexOf("" + c1);
			if (index != -1) {
				sb = sb.deleteCharAt(index);
			}else{
				return false;
			}
		}
		return sb.length() == 0 ? true : false;
	}

}
