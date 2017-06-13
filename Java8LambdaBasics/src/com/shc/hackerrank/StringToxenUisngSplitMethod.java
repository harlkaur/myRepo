package com.shc.hackerrank; 

import java.util.Scanner;

public class StringToxenUisngSplitMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		/*String s2 = str.replaceAll("[\\p{Punct}]", " ");
		s2 = s2.replaceAll("  ", " ");
		String[] sss = s2.split(" ");
		
		System.out.println(sss.length);
		for(String res: sss){
			System.out.println(res);
		}*/
		
		//[\s.,?!_\@]+
		//s.trim().split("[ !,?.\_'@]+")
		String[] res = str.split("[!,?.*_'@\\ ]+");
		System.out.println(res.length);
		for(String word : res){
            System.out.println(word);
        }
		
	}

}
