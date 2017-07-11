package com.shc.thread;

public class DeadLockDemo {

	public void method1(){
		synchronized(String.class){
			System.out.println("acquired lock on string object");
		}
		synchronized(Integer.class){
			System.out.println("acquired lock on integer object");
		}
	}
	
	public void method2(){
		synchronized(Integer.class){
			System.out.println("acquired lock on integer object");
		}
		synchronized(String.class){
			System.out.println("acquired lock on string object");
		}
	}
}
