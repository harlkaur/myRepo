package com.shc.queue;

public class QueueTest {

	int maxSize = 5;
	int[] arr = new int[maxSize];
	int top = -1;

	public QueueTest(int maxSize) {

		this.maxSize = maxSize;
	}

	public static void main(String[] args) {
		QueueTest queueTest = new QueueTest(5);
		queueTest.enqueue(20);
		queueTest.enqueue(30);
		queueTest.enqueue(40);
		queueTest.dequeue();
		queueTest.dequeue();
	}

	private int enqueue(int data) {
		if (top == maxSize - 1) {
			System.out.println("Queue is full!!! sorry cannot insert items");
		}
		top++;
		arr[top] = data;
		return arr[top];
	}

	private int dequeue() {
		if (top == -1) {
			System.out.println("Sorry!!! queue is empty, cannot delete items from the queue");
		}
		int value = this.arr[0];
		for (int i = 0; i < maxSize - 1; i++) {
			arr[i] = arr[i+1];
		}
		top--;
		return value;
	}
}
