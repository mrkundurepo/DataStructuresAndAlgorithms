// Singly Linked list
public class A12_SinglyLinkedList {
	private ListNode head;
	private class ListNode {
		private int data; 
		private ListNode next;
		private ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	// Display the linkedlist
	public void printLinkedList(){
		if(head == null){
			System.out.println("null");
		}
		ListNode current = head;
		while(null != current){
			System.out.print(current.data + " ==> ");
			current = current.next;
		}
		System.out.println("null");
	}
	// Creating looped linked list
	public void createALoopInLinkedList(){
		ListNode first = new ListNode(1)
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(4);
		ListNode fifth = new ListNode(4);
		ListNode sixth = new ListNode(4);
		head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		fifth.next = sixth;
		sixth.next = third;
	}
	// How to detect a loop in a linked list 
	public boolean containsLoop(){
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null){
			fastPtr = fastPtr.next.next; 
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr){
				return true;
			}
		}
		return false;
	}
	// How to find start of the singly linkedlist loop
	public ListNode startNodeInALoop(){
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null){
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr){
				return getStartingNode(slowPtr);
			}
		}
		return false;
	}
	private ListNode getStartingNode(ListNode slowPtr){
		ListNode temp = head; 
		while(slowPtr != temp){
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		return temp;
	}
	// Remove a loop from a singly linked list
	public void removeLoop(){
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while(fastPtr != null && fastPtr.next != null){
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if(slowPtr == fastPtr){
				removeLoop(slowPtr); 
				return;
			}
		}
	}
	private void removeLoop(ListNode slowPtr){
		ListNode temp = head;
		while(temp.next != slowPtr.next){
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
	}
	public static void main(String[] args){
		A12_SinglyLinkedList sll = new A12_SinglyLinkedList();
		sll.createALoopInLinkedList();
		System.out.println(sll.containsLoop());
		System.out.println(sll.startNodeInALoop().data);
		sll.removeLoop();
		sll.printLinkedList();
	}
}