package com.shc.thread;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class PCPattern {

	public static void main(String[] args) {
		BlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
		int maxSize = 10;
		Runnable p = new Producer14(queue, maxSize);
		Thread t1 = new Thread(p);
		t1.start();
		Runnable c = new Consumer14(queue, maxSize);
		Thread t2 = new Thread(c);
		t2.start();

	}
}

class Producer14 implements Runnable {
	private BlockingQueue<Integer> queue;
	private int maxSize;

	public Producer14(BlockingQueue<Integer> queue, int maxSize) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				if (queue.size() == maxSize) {
					System.out.println("Queue is full" + "Waiting for consumer to consume some items from the queue");

					try {
						queue.wait();
					} catch (Exception e) {
						System.out.println(e);
					}
				} else {
					Random random = new Random();
					int i = random.nextInt();
					System.out.println("Adding items " + i);
					queue.notifyAll();
				}
			}
		}
	}
}

class Consumer14 implements Runnable {
	private BlockingQueue<Integer> queue;
	private int maxSize;

	public Consumer14(BlockingQueue<Integer> queue, int maxSize) {
		this.maxSize = maxSize;
		this.queue = queue;
	}

	@Override
	public void run() {

		while (true) {
			synchronized (queue) {
				if (queue.isEmpty()) {
					System.out.println("Queue is empty" + "Waiting for producer to produce some items");

					try {
						queue.wait();
					} catch (Exception e) {
						System.out.println(e);
					}
				} else
					System.out.println("Consuming items" + queue.remove());
				queue.notifyAll();
			}
		}
	}

}
