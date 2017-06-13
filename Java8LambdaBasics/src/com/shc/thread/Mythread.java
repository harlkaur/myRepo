package com.shc.thread;

/*public class Mythread {

    public static void main(String[] args) {
        Runnable r = new Runnable1();
        Thread t = new Thread(r);
        Runnable r2 = new Runnable2();
        Thread t2 = new Thread(r2);
        t.start();
        t2.start();
    }
}

class Runnable2 implements Runnable{
    public void run(){
        for(int i=0;i<11;i+=2) {
            System.out.println(i);
        }
    }
}

class Runnable1 implements Runnable{
    public void run(){
        for(int i=1;i<=11;i+=2) {
           System.out.println(i);
        }
    }
}*/

public class Mythread {
	public static void main(String[] args) {
		Runnable r1 = new Runnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		Runnable r2 = new Runnable2();
		Thread t2 = new Thread(r2);
		t2.start();

	}
	
}

class Runnable1 implements Runnable {
	public synchronized void run() {
		for (int i = 1; i < 11; i += 2) {
			try {
				System.out.println(i);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();
		}
	}
}

class Runnable2 implements Runnable {
	public synchronized void run() {
		for (int i = 0; i < 11; i += 2) {
			try {
				System.out.println(i);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			notifyAll();
		}
	}
}

