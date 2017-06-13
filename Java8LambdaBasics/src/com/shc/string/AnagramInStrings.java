package com.shc.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramInStrings {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		String input1 = sc.next();
		String input2 = sc.next();
		char[] c1 = input1.toCharArray();
		char[] c2 = input2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);

		System.out.println(c1);
		System.out.println(c2);*/

		// ONE WAY TO COMPARE THE LENGTH AND CHECK FOR EACH CHARACTER
		/*int length = c1.length;
		if (c2.length == length) {
			for (int i = 0; i < length; i++) {
				if (c1[i] == c2[i]) {
					System.out.println("Strings are anagrams");
				}
			}
		}else{
			System.out.println("Sorry");
		}
	}*/
		
		// OTHER WAY TO USE ARRAYS.EQUALS METHOD DIRECTLY
		/*if (Arrays.equals(c1, c2)) {
			System.out.println("Strings are anagrams");
		} else {
			System.out.println("SOrry");
		}*/
		
		
		//THIRD WAY WITHOUT USING ANY BUILTIN FUCNTION
		if(checkAnagram("java","aaajv")){
			System.out.println("String are anagrams");
		}else{
			System.out.println("sorry");
		}
	}
	
	public static boolean checkAnagram(String first, String second)
	{
		char[] characters = first.toCharArray();
		StringBuilder sbSecond = new StringBuilder(second);
		for (char ch : characters) {
			int index = sbSecond.indexOf("" + ch);
			if (index != -1) {
				sbSecond.deleteCharAt(index);
			} else {
				return false;
			}
		}
		return sbSecond.length() == 0 ? true : false;
	}

}
