package com.design.pattern;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte x = 64;
		int i;
		byte y;
		i = x<<2;
		y = (byte)(x<<2);
		System.out.println(i + " " + y);
		
		String str = "TimeIncIndia";
		str.concat(".com");
		str = str.toUpperCase();
		str.replace("INC","Inc");
		System.out.println(str);
	}

}
