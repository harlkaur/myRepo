package com.shc.collection;

import java.util.HashSet;

public class SizeofSet {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		String s1 = "Harleen";
		String s2 = new String("Harleen");
		set.add(s1);
		set.add(s2);
		System.out.println(set.size());
	}

}
