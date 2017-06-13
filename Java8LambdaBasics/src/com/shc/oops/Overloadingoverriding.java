package com.shc.oops;

import java.io.IOException;

public class Overloadingoverriding {

	public static void main(String[] args)  {
		Pp p = new Pp();
		p.makeNoise();
		p.eats("Harleen", 2);
		Pp p1 = new Cc();
		p1.makeNoise();
		p1.eats("Eshleen", 1);
		Cc c = new Cc();
		c.eats("Soeleen");
	}

}

class Pp {
	protected void makeNoise()  {
		System.out.println("Talks");
	}

	public static void eats(String name, int count) {
		System.out.println("fruits");
	}
}

class Cc extends Pp {
	public void makeNoise() throws NullPointerException {
		System.out.println("Hmmms");
	}

	public static String eats(String name) {
		System.out.println("cerelac");
		return "";
	}
}