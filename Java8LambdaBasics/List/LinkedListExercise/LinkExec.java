package LinkedListExercise;

public class LinkExec {

	public static void main(String[] args) {

		LinkedList1 ll = new LinkedList1();
		
		ll.insertAtEnd(10);
		ll.insertAtEnd(20);
		ll.insertAtEnd(30);
		ll.insertAtEnd(40);
		
		ll.insertAtBeg(0);
		
		ll.insertAtPos(4,25);
		
		ll.deleteAtBeg(0);
		
		ll.deleteAtEnd(40);
		
		ll.deleteAtpos(1,20);
		
		ll.traverse();
	}

}
