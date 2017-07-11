package com.shc.thread;

public class ResolveDeadLockTest {

	public static void main(String[] args) {

		ResolveDeadLockTest resolveDeadLockTest = new ResolveDeadLockTest();
		Runnable a = new A();
		Thread t1 = new Thread(a);
		t1.start();
		Runnable b = new B();
		Thread t2 = new Thread(b);
		t2.start();

	}

}

class A implements Runnable {

	@Override
	public void run() {
        Object a;
		synchronized(Integer.class){
        	System.out.println("Acquired lock on Integer object");
        }
		
	}

}

class B implements Runnable{

	@Override
	public void run() {

		
	}
	
}