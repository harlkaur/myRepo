package LinkedListExercise;

public class LinkedList1 {

	private ListNode head;
	private int length;

	public LinkedList1() {

	}

	public LinkedList1(ListNode head, int length) {
		this.head = head;
		this.length = length;
	}

	public ListNode getHead() {
		return head;
	}

	public void setHead(ListNode head) {
		this.head = head;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void insertAtEnd(int n2) {
		ListNode currentAdd = new ListNode(n2);
		if (head == null) {
			head = currentAdd;
			return;
		}
		ListNode ptr = head;
		while (ptr.getNext() != null) {
			ptr = ptr.getNext();
		}
		ptr.setNext(currentAdd);
	}

	public void insertAtBeg(int n1) {
		ListNode currentAdd = new ListNode(n1);
		if (head == null) {
			System.out.println("Single element in the list: " + currentAdd.getData());
		}
		ListNode current = head;
		currentAdd.setNext(current);
		currentAdd.setData(n1);
		head = currentAdd;
	}

	public void insertAtPos(int pos, int data) {
		if (head == null) {
			System.out.println("Sorry Empty LL");
		}
		int length = 0;
		ListNode insertSpec = new ListNode();
		ListNode current = head;
		ListNode prev = current;
		while (current != null) {
			length += 1;
			current = current.getNext();
		}
		System.out.println("length of linked list is :" + length);
		current = head;
		if (pos < length) {
			for (int i = 0; i < length; i++) {
				if (i == pos) {
					insertSpec.setNext(current);
					insertSpec.setData(data);
					prev.setNext(insertSpec);
				}
				prev = current;
				current = current.getNext();
			}

		} else {
			System.out.println("Sorry! Invalid insertion");
		}
	}
	
	public void deleteAtBeg(int data){
		if(head == null){
			System.out.println("Sorry!!! empty LL");
		}
		ListNode current = head;
		if(current.getData() == data){
			current=current.getNext();
			head = current;
		}
		while(current != null){
			System.out.println("After deleting : "+current.getData());
			current=current.getNext();
		}
	}
	
	public void deleteAtEnd(int data) {
		if (head == null) {
			System.out.println("Sorry!!! empty LL");
		}
		ListNode current = head;
		while(current != null){
			ListNode prev = current;
			current = current.getNext();
			if (current.getNext() == null) {
				prev.setNext(null);
				return;
			}
		}
	}
	
	public void deleteAtpos(int pos,int data){
		if (head == null) {
			System.out.println("Sorry!!! empty LL");
		}
		ListNode current = head;
		while(current != null){
			ListNode prev = current;
			current = current.getNext();
			if(current.getData() == data){
				prev.setNext(current.getNext());
				return;
			}
		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("Empty LL");
		}
		ListNode current = head;
		while (current != null) {
			System.out.println(current.getData() + ":");
			current = current.getNext();
		}
	}

}
