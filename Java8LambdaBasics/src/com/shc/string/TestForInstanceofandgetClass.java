package com.shc.string;

public class TestForInstanceofandgetClass {

	public static void main(String[] args) {

		Parent p = new Parent();
		Child c = new Child();
		if (p.getClass() == c.getClass()) {
			System.out.println("getclass equals method between parent and child");
		}
		if (c instanceof Parent) {
			System.out.println("child instance of parent class");
		}
		if (p instanceof Child) {
			System.out.println("parent instance of child class");
		}
		if (p instanceof Parent) {
			System.out.println("parent instance of parent class");
		}
		if (c instanceof Child) {
			System.out.println("child instance of Child class");
		}
	}

}

class Parent {

	public void show() {
		System.out.println("Parent's method");
	}
}

class Child extends Parent {

	public void show() {
		System.out.println("Child's method");
	}
}
