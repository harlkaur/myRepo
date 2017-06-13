package com.shc.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class LexographicOrderOfString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int k = sc.nextInt();
		String[] ss;
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i+k <= str.length(); i++){
			sb = sb.append(str.substring(i,i+k));
			sb = sb.append(" ");
		}
		
		String s = sb.toString();
		ss = s.split(" ");
		
		Arrays.sort(ss);
			System.out.println(ss[0]);
			System.out.println(ss[ss.length-1]);
	}

}
