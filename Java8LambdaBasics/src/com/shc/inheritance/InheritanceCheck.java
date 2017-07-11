package com.shc.inheritance;

class GrandParent {
	public void eats() {
		System.out.println("Oats");
	}
}

class Parent extends GrandParent {
	public void move() {
		System.out.println("walk");
	}
}

class Child extends Parent {
	public void crawls() {
		System.out.println("crawls");
	}

	public void move() {
		System.out.println("run");
	}

	public void eats() {
		System.out.println("milks");
	}
}

public class InheritanceCheck {

	public static void main(String[] args) {

		Child c = new Child();
		c.eats();
		Parent p = new Child();
		p.move();
		GrandParent g = new GrandParent();
		g.eats();
		GrandParent g1 = new Child();
		g1.eats();
		c.move();
		GrandParent g2 = new Parent();
		g2.eats();
		c.eats();
	}

}
