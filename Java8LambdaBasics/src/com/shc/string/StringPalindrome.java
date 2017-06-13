package com.shc.string;

public class StringPalindrome {

	public static void main(String[] args) {

		String str1 = "madam";
		String str2 = "nan";

		System.out.println("Searching for string2 in string1 : " + str1.indexOf(str2));
		
		searchForString(str1,str2);
		checkForPalindrome(str1, str2);
	}

	private static void checkForPalindrome(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int length = c1.length;
		int count = 0;
		if (c2.length == length) {
			for (int i = 0; i < length; i++) {
				if (c1[i] == c2[i]) {
					count++;
				} else {
					System.out.println("Strings are not Palindrome");
					return;
				}
			}
		} else {
			System.out.println("Strings are not palindrome!!!");
		}
		if (count == length) {
			System.out.println("Strings are palindrome!!!");
		}
	}
	
	private static void searchForString(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		int count = 0;
		
		for (int i = 0; i < c2.length;) {
			for (int j = 0; j < c1.length; j++) {
				if (c2[i] == c1[j]) {
					count++;
					i++;
					if (count == c2.length){
						System.out.println("Contains");
						return;
					}
				}else{
					if(count>=1){
						System.out.println("Sorry");
						return;
					}
				}
			}
		}
	}
}
