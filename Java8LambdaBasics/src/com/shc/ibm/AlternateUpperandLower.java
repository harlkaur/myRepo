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
			System.out.println("The string entered is:" + str);
			String result = alternateCase(str);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static String alternateCase(String s) {
		boolean checkCase = false;
		String newCase = "";
		char[] ch = s.toCharArray();
		/*for (int i = 0; i < ch.length; i++) {
			if (Character.isAlphabetic(ch[i])) {
				if (Character.isAlphabetic(ch[i]) && Character.isUpperCase(ch[i])) {
					Character.toLowerCase(ch[i]);
					checkCase = true;
				} else if (Character.isAlphabetic(ch[i]) && Character.isLowerCase(ch[i])) {
					Character.toUpperCase(ch[i]);
					checkCase = true;
				}
			} else {
				checkCase = false;
			}

		}*/
		
		for(int i=0;i<ch.length;i++){
			if(Character.isAlphabetic(ch[i])){
				Character.toUpperCase(ch[i]);
				checkCase = true;
			}
		}
		return s;
		
	}
}
