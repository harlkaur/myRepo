package com.shc.string;

public class SearchForString1intoString2 {

	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "man";

		// using build in fucntions(index of)
		System.out.println("Searching for string2 in string1 : " + str1.indexOf(str2));

		// without using built in functions
		searchForString(str1, str2);
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
					if (count == c2.length) {
						System.out.println("Contains");
						return;
					}
				} else {
					if (count >= 1) {
						System.out.println("Sorry");
						return;
					}
				}
			}if(count == 0){
				System.out.println("Sorry");
			}
		}
	}

}
