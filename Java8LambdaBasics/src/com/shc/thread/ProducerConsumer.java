package com.shc.thread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumer {
	public static void main(String args[]) {
		System.out.println("How to use wait and notify method in Java");
		System.out.println("Solving Producer Consumper Problem");
		Queue<Integer> buffer = new LinkedList<>();
		int maxSize = 10;
		Thread producer = new Producer1(buffer, maxSize, "PRODUCER");
		Thread consumer = new Consumer1(buffer, maxSize, "CONSUMER");
		producer.start();
		consumer.start();
	}
}

class Producer1 extends Thread {
	private Queue<Integer> queue;
	private int maxSize;

	public Producer1(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.size() == maxSize) {
					try {
						System.out.println("Queue is full, " + "Producer thread waiting for "
								+ "consumer to take something from queue");
						queue.wait();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producing value : " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}
}

class Consumer1 extends Thread {
	private Queue<Integer> queue;
	private int maxSize;

	public Consumer1(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.queue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				while (queue.isEmpty()) {
					System.out.println("Queue is empty," + "Consumer thread is waiting"
							+ " for producer thread to put something in queue");
					try {
						queue.wait();
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				}
				System.out.println("Consuming value : " + queue.remove());
				queue.notifyAll();
			}
		}
	}
}

class PC {
	public static void main(String[] args) {
		int maxSize = 10;
		Queue<Integer> size = new LinkedList<>();
		Prod p = new Prod(maxSize, size);
		Cons c = new Cons(maxSize, size);
		p.start();
		c.start();
	}
}

class Prod extends Thread {
	int maxSize;
	Queue<Integer> queue;

	public Prod(int maxSize, Queue<Integer> q) {
		this.maxSize = maxSize;
		this.queue = q;
	}

	@Override
	public void run() {
		synchronized (queue) {
			while (queue.size() == maxSize) {
				System.out.println("Queue is full, waiting for consumer to consume items from queue");
				try {
					queue.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			Random r = new Random();
			int k = r.nextInt();
			System.out.println("producing values+" + k);
			queue.add(k);
			queue.notifyAll();
		}
	}
}

class Cons extends Thread{
	
	int maxSize;
	Queue<Integer> queue;
	public Cons(int maxSize,Queue<Integer> qq){
		this.maxSize = maxSize;
		this.queue = qq;
	}
	
	@Override
	public void run(){
		synchronized(queue){
			while(queue.isEmpty()){
				try{
					System.out.println("Waiting for produicng to produce items");
					queue.wait();
				}catch(Exception e){
					e.printStackTrace();
				}
				System.out.println("consuming values +"+queue.remove());
				queue.notifyAll();
			}
		}
	}
}

class Runner1234 extends Thread{
	boolean bExit = false;
	public void exit(boolean bExit){
		this.bExit = bExit;
	}
	
	@Override
	public void run(){
		while(!bExit){
			System.out.println("thread s running");
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				//
			}
		}
	}
}


class Runner5435 extends Thread{
	boolean bExit = false;
	public void exit(boolean bExit){
		this.bExit = bExit;
	}
	@Override
	public void run(){
		while(!bExit){
			System.out.println("Thread s running");
		
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			
		}
		}
	}
}