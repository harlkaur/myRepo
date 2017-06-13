package com.shc.hackerrank;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class MD5Algo {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		byte[] bytes = str.getBytes();
		StringBuffer sb = new StringBuffer("");
		MessageDigest md = MessageDigest.getInstance("MD5");
		md.update(bytes);
		byte[] res = md.digest();
		for(int i=0;i<res.length;i++){
			sb.append(Integer.toString((res[i] & 0xff) + 0x100, 16).substring(1));
		}
		System.out.println(sb.toString());
	}

}
