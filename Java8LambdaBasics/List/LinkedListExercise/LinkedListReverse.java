package LinkedListExercise;

public class LinkedListReverse {

	public static void main(String[] args) {

		ll list = new ll();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.traverse();

		list.reverse();
		
		list.traverse();
	}

}

class ll {

	private Node head;
	private int length;

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "ll [head=" + head + ", length=" + length + "]";
	}

	public void add(int data) {
		Node addNode = new Node(data);
		if (head == null) {
			head = addNode;
			return;
		}
		Node current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(addNode);
	}

	public void traverse() {
		if (head == null) {
			System.out.println("Empty LL");
		}
		Node current = head;
		while (current != null) {
			System.out.println(current.getData() + ":");
			current = current.getNext();
		}
	}

	public void reverse() {
		if (head == null) {
			System.out.println("Empty LL");
		}
		Node current = head;
		Node prev = null;
		int i = 0;
		int j = 0;
		while (current != null) {
			current = current.getNext();
			length++;
		}
		System.out.println("length of linked list:" + length);
		if (length % 2 == 0) {
			System.out.println("even linked list :");
		} else {
			System.out.println("odd linked list :");
			current = head;
			while ((current.getNext() != null) && (current.getNext().getNext() != null)) {
				prev = current;
				current = current.getNext().getNext();
				i++;
			}
			System.out.println("data of prev location:" + prev.getData());
			System.out.println("value of current :" + current.getData());
			Node curr = head;
			Node temp = null;
			Node next = prev.getNext();
			while (curr != prev) {
				temp = curr;
				curr = current;
				current = temp;
				//curr = curr.getNext();
//				current = next;
			}
		}
	}
}

class Node {
	private Node next;
	private int data;

	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}

	Node(int data) {
		this.data = data;
	}

	Node(Node next, int data) {
		this.next = next;
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

}
