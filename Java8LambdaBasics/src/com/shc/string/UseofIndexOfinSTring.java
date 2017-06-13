package com.shc.string;

import java.util.ArrayList;
import java.util.List;

// test for suppress warning annotation
public class UseofIndexOfinSTring {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {

		String str = "Harleen";
		String s = "e";
		System.out.println(str.indexOf(s));
		@SuppressWarnings("unused")
		List l  = new ArrayList();
		//System.out.println(l);
	}

}
