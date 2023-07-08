public class A13_SinglyLinkedList {
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
	// insert list from end
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			head = newNode;
			return;
		}
		ListNode current = head;
		while(null != current.next){
			current = current.next;
		}
		current.next = newNode;
	}
	// Merge two sorted singly linked list
	public ListNode merge(ListNode a, ListNode b){
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		while (a!=null && b!=null){
			if(a.data <= b.data){
				tail.next = a;
				a = a.next;
			} else {
				tail.next = b;
				b = b.next;
			} tail = tail.next;
		}
		if(a==null){
			tail.next = b;
		} else {
			tail.next=a;
		}
		return dummy.next;
	}
	// Add two singly linked List
	public ListNode add(ListNode a, ListNode b){
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		int carry = 0;
		while(a!=null || b!= null){
			int x = (a != null)? a.val:0;
			int y = (b != null)? b.val:0;
			int sum = carry + x + y;
			carry = sum/10;
			tail.next = new ListNode(sum%10);
			tail = tail.net;
			if(a != null) a = a.next;
			if(b != null) b = b.next;
		} 
		if(carry>0){
			tail.next = new ListNode(carry);
		}
		return dummy.next;
	}
	public static void main(String[] args){
		A12_SinglyLinkedList sll1 = new A12_SinglyLinkedList();
		sll1.insertLast(1);
		sll1.insertLast(2);
		sll1.insertLast(4);
		sll1.printLinkedList();				
		A12_SinglyLinkedList sll2 = new A12_SinglyLinkedList();
		sll2.insertLast(3);
		sll2.insertLast(5);
		sll2.insertLast(8);				
		sll2.insertLast(9);
		sll2.insertLast(14);
		sll2.insertLast(18);
		sll2.printLinkedList();				
		A12_SinglyLinkedList result = new A12_SinglyLinkedList();
		result.head = merge(sll1.head, sll2.head);
		result.printLinkedList();
		result.head = add(sll1.head, sll2.head);
		result.printLinkedList();

}