// SinglyLinkedList Static
// How to represent singly linked list
public class A10_SinglyLinkedListStatic {
	// Program Functions
	private ListNode head;
	private static class ListNode {
		private int data; 
		private ListNode next;
		private ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	public void display(){
		ListNode current = head;
		while (current != null){
			System.out.print(current.data + " ==> ");
			current = current.next;
		}
		System.out.println("null");
	}
	// How to find the length of a singly linked list
	public int length(){
		if(head == null){
			return 0;
		}
		int count = 0;
		ListNode current = head;
		while(current != null){
			count++;
			current = current.next;
		}
		return count;
	}	
	// How to create a singly linked list in java	
	public static void main(String[] args){
		A10_SinglyLinkedListStatic sll = new A10_SinglyLinkedListStatic();
		sll.head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode fourth = new ListNode(11);
		sll.head.next = second;
		second.next = third;
		third.next = fourth;
		sll.display();
		System.out.println("Length is - " + sll.length());
	}
}
