package com.design.pattern;

import java.util.Arrays;


public class LinearShifting {

	public static void main(String[] args) {
		int[] a = { -1, 7, 3, -5, 4, -3, 1, 2 };
		sort(a);
		
		for(int i = 0; i < a.length / 2; i++)
		{
		    int temp = a[i];
		    a[i] = a[a.length - i - 1];
		    a[a.length - i - 1] = temp;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void sort(int[] a) {
		int pos = 0;
		int neg = 0;
		int i, j;
		int max = Integer.MIN_VALUE;
		for (i = 0; i < a.length; i++) {
			if (a[i] < 0)
				neg++;
			else
				pos++;
			if (a[i] > max)
				max = a[i];
		}
		max++;
		if (neg == 0 || pos == 0)
			return;// already sorted
		i = 0;
		j = 1;
		while (true) {
			while (i <= neg && a[i] < 0)
				i++;
			while (j < a.length && a[j] >= 0)
				j++;
			if (i > neg || j >= a.length)
				break;
			a[i] += max * (i + 1);
			swap(a, i, j);
		}

		i = a.length - 1;
		while (i >= neg) {
			int div = a[i] / max;
			if (div == 0)
				i--;
			else {
				a[i] %= max;
				swap(a, i, neg + div - 2);// minus 2 since a[i]+= max*(i+1);
			}
		}

	}

	private static void swap(int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

}
