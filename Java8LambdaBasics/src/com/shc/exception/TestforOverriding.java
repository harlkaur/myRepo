package com.shc.exception;

import java.io.IOException;

public class TestforOverriding {

	public static void main(String[] args) throws Exception{

		Parent p = new Child();
		p.makeNoise();
		Child c  = new Child();
		c.makeNoise();
		Parent p1 = new Parent();
		p1.makeNoise();
	}
}

	
	class Parent{
		public void makeNoise() throws Exception {
			System.out.println("Talks");
		}
		public void walks(){
			System.out.println("walk method");
		}
	}
	
	class Child extends Parent{
		public void makeNoise() throws IOException{
			System.out.println("Hmms");
		}
		public void run(){
			System.out.println("run metho");
		}
	}
