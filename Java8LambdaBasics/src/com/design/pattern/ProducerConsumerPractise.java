package com.design.pattern;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ProducerConsumerPractise {

	public static void main(String[] args) {

		int maxSize = 10;
		Queue<Integer> buffer = new LinkedList<Integer>();
		P producer = new P(maxSize, buffer);
		Thread t1 = new Thread(producer);

		C consumer = new C(maxSize, buffer);
		Thread t2 = new Thread(consumer);

		t1.start();
		t2.start();

	}

}

class P implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	P(int maxSize, Queue<Integer> queue) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				try {
					while (queue.size() == maxSize) {
						System.out.println("Queue is full !!! Waiting for consumer to consume items");
						queue.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Random random = new Random();
				int i = random.nextInt();
				System.out.println("Producer producing items:: " + i);
				queue.add(i);
				queue.notifyAll();
			}
		}
	}

}

class C implements Runnable {
	private Queue<Integer> queue;
	private int maxSize;

	C(int maxSize, Queue<Integer> queue) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (queue) {
				try {
					while (queue.size() == 0) {
						System.out.println("Queue is empty!!! Waiting for producer to produce items");
						queue.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("consuming values:: " + queue.remove());
				queue.notifyAll();
			}
		}
	}
}