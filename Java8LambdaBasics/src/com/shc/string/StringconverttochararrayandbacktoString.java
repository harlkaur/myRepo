package com.shc.string;

public class StringconverttochararrayandbacktoString {

	public static void main(String[] args) {

		test();
	}
	public static void test(){
		 String str = "Harleen";
		 char[] ch1 = str.toCharArray();
		 for(char ch:ch1){
		 System.out.println(ch);
		 }
		 String data = new String(ch1);
		 System.out.println("converting to string using the new operator:: "+data);
		 String s = String.valueOf(ch1);
		 System.out.println("converting to string using valueOf data:: " + s);
		 String ss = String.copyValueOf(ch1);
		 System.out.println("converting to string using copyvalueOf data:: " + ss);
	}
}
