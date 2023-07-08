// Doubly Linked List
public class A14_DoublyLinkedList{
	private ListNode head;
	private ListNode tail;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next; 
		private ListNode previous;
		public ListNode(int data){
			this.data = data;
		}
	}
	// Implement DoublyLinkedList
	public A14_DoublyLinkedList(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	public boolean isEmpty(){
		return length == 0;
		//head == null
	}
	public int length(){
		return length;
	}
	// Print doubly linkedList
	public void displayForward(){
		if(head==null){
			return;
		}
		ListNode temp = head;
		while(temp != null){
			System.out.print(temp.data + " ==> ");
			temp = temp.next;
		}
		System.out.println("null");
	}
	public void displayBackward(){
		if(tail == null){
			return;
		}
		ListNode temp = tail;
		while(temp != null){
			System.out.print(temp.data + " ==> ");
			temp = temp.previous;
		}
		System.out.println("null");
	}
	// Insert Element
	public void insertLast(int value){
		ListNode newNode = new ListNode(value);
		if(isEmpty(){
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.previous = tail;			
		}
		tail = newNode;
		length++;
	}
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		if(isEmpty()){
			tail = newNode;
		} else {
			head.previous = newNode;
		}
		newNode.next = head;
		head = newNode;
		length++;
	}
	// Delete nodes
	public ListNode deleteFirst(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp = head;
		if(head == tail){
			tail = null;
		} else {
			head.next.previous = null;
		}
		head = head.next;
		temp.next = null;
		length--;
		return temp;
	} 
	public ListNode deleteLast(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		ListNode temp = tail;
		if(head == tail){
			head = null;
		} else {
			tail.previous.next = null;
		}
		tail = tail.previous;
		temp.previous = null;
		length--;
		return temp;
	}
	public static void main(String[] args){
		A14_DoublyLinkedList dll = new A14_DoublyLinkedList();
		dll.insertLast(1);
		dll.insertLast(10);
		dll.insertLast(101);
		dll.insertLast(110);
		dll.insertLast(111);
		dll.insertLast(1110);
		dll.displayForward();
		dll.displayBackward();
		dll.insertFirst(45);
		dll.insertFirst(89);
		dll.insertFirst(189);
		dll.insertFirst(423);		
		dll.insertFirst(6532);		
		dll.displayForward();
		dll.displayBackward();	
		dll.deleteFirst();
		dll.deleteFirst();
		dll.displayForward();
		dll.displayBackward();	
		dll.deleteLast();
		dll.deleteLast();
		dll.displayForward();
		dll.displayBackward();	

	}
}