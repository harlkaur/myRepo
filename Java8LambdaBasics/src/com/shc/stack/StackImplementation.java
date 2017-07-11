package com.shc.stack;

public class StackImplementation {

	static int top = 0;
	int maxSize = 10;
	int arr[] = new int[5];

	public StackImplementation(int top, int maxSize) {
		this.top = top;
		this.maxSize = maxSize;
	}

	public static void main(String[] args) {
		StackImplementation stackImplementation = new StackImplementation(top, 5);
		stackImplementation.push(20);
		stackImplementation.push(3);
		stackImplementation.push(6);
		stackImplementation.push(4);
		stackImplementation.push(9);
		stackImplementation.push(34);
		stackImplementation.pop();
		stackImplementation.pop();
		stackImplementation.peek();
	}

	public void push(int data) {
		if (top == maxSize) {
			System.out.println("Sorry!!! cannot insert items");
		} else {
			arr[top] = data;
			top++;
		}
	}

	public int pop() {
		if (top == -1) {
			System.out.println("Sorry!!! Stack is empty. please insert some items into the stack");
		}
		top--;
		int element = arr[top];
		return element;
	}

	public int peek() {
		if (top == -1) {
			System.out.println("Sorry!!! Stack is empty. please insert some items into the stack");
		}
		top--;
		return arr[top];
	}
}
