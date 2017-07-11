package com.shc.oops;

abstract class P14 {

	protected P14() {
		System.out.println("Abstract Construtor");
	}

	abstract void show();
}

class C14 extends P14 {

	public void show() {
		System.out.println("Child's show method");
	}
}

public class AbstractClassConcept {

	public static void main(String[] args) {

		P14 p = new C14();
		p.show();
	}

}
/*
abstract class AbstractClassConcept {
	private AbstractClassConcept() {
		System.out.println("Private constructor");
	}

	abstract void show();

	static class ChildClass extends AbstractClassConcept {
		void show() {
			System.out.println("Child class concept");
		}
	}

	public static void main(String[] args) {
		new ChildClass().show();
	}
}*/