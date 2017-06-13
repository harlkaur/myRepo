package LinkedListExercise;

public class LinkedListMiddle {

	public static void main(String[] args) {

		LinkListt linkedList = new LinkListt();
		LinkListt.Node head = linkedList.head();
		// linkedList.add(new LinkList.Node("101"));
		linkedList.add(new LinkListt.Node("1"));
		linkedList.add(new LinkListt.Node("2"));
		linkedList.add(new LinkListt.Node("3"));
		linkedList.add(new LinkListt.Node("4"));
		linkedList.add(new LinkListt.Node("5"));

		LinkListt.Node current = head;
		int length = 0;
		LinkListt.Node middle = head;

		while (current.next() != null) {
			length++;
			if (length % 2 == 0) {
				middle = middle.next();
			}
			current = current.next();
		}

		if(length%2 == 1){
			middle = middle.next();
		}
		
		System.out.println("length of list"+" "+ length);
		System.out.println("Middle element in list"+ " "+ middle);
	}
}

class LinkListt {
	private Node head;
	private Node tail;

	public LinkListt() {
		this.head = new Node("head");
		tail = head;
	}

	public Node head() {
		return head;
	}

	public Node tail() {
		return tail;
	}

	public void add(Node node) {
		tail.next = node;
		tail = node;
	}

	public static class Node {

		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		public Node next() {
			return next;
		}

		public void setData(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public String toString() {
			return this.data;
		}
	}
}
