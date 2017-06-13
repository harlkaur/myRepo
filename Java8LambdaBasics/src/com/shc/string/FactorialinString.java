package com.shc.string;

public class FactorialinString {

	public static void main(String[] args) {

		int num = 6;
		int output = factorial(num);
		System.out.println("Factorial of a number is :" + output);
	}

	private static int factorial(int num) {

		int fact =1;
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		return fact;
	}
}
