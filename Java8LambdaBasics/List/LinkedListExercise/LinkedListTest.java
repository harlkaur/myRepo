package LinkedListExercise;

class LinkedList {

	private Node head;

	public LinkedList() {
		this.head = new Node("head");
	}

	public Node head() {
		return head;
	}

	public void appendToTail(Node node) {
		Node current = head;
		while (current.next != null) {
			current = current.next();
		}
		current.setNext(node);
	}

	public boolean isCyclic() {
		Node fast = head;
		Node slow = head;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;

		if (fast == slow) {
			return true;
		   }
		}

		return false;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		Node current = head.next;
		while (current != null) {
			sb.append(current).append("---->");
			current = current.next;
		}
		sb.delete(sb.length() - 3, sb.length());
		return sb.toString();
	}

	public static class Node {
		private Node next;
		private String data;

		public Node(String data) {
			this.data = data;
		}

		public String data() {
			return data;
		}

		public void setData(String data) {
			this.data = data;
		}

		public Node next() {
			return next;
		}

		public void setNext(Node next) {
			this.next = next;
		}

		@Override
		public String toString() {
			return this.data;
		}
	}
}

public class LinkedListTest {
	public static void main(String[] args) {

		/*
		 * LinkedList ll = new LinkedList(); ll.appendToTail(new
		 * LinkedList.Node("101")); ll.appendToTail(new LinkedList.Node("201"));
		 * ll.appendToTail(new LinkedList.Node("301")); ll.appendToTail(new
		 * LinkedList.Node("401"));
		 */

		LinkedList ll = new LinkedList();
		ll.appendToTail(new LinkedList.Node("101"));
		LinkedList.Node cycle = new LinkedList.Node("201");
		ll.appendToTail(cycle);
		ll.appendToTail(new LinkedList.Node("301"));
		ll.appendToTail(new LinkedList.Node("401"));
		ll.appendToTail(cycle);

//		System.out.println("Linked List" + " " + ll);

		if (ll.isCyclic()) {
			System.out.println("cyclic ll");
		} else {
			System.out.println("non cyclic ll");
		}

	}
}