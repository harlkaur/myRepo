package com.shc.string;

public class ReverseWordsinString {

	public static void main(String[] args) {

		String str = "My name is Harleen Kaur";
		String[] str1 = str.split(" ");
		System.out.println("length of str is : " + str1.length);
		StringBuilder sb = new StringBuilder();
		for (int i = str1.length - 1; i >= 0; i--) {
			sb = sb.append(str1[i] + " ");
		}
		System.out.println(sb);
	}

}
