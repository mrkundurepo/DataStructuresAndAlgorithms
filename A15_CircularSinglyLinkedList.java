// Circular singly linked list
public class A15_CircularSinglyLinkedList{
	private ListNode last;
	private int length;
	private class ListNode{
		private ListNode next;
		private int data;
		public ListNode(int data){
			this.data = data;
		}
	}
	public A15_CircularSinglyLinkedList{
		last = null;
		length == 0;
	}
	public int length(){
		return lenght;
	}
	public boolean isEmpty(){
		return length = 0;
	}
	// Create circular linked list
	public void createCircularLinkedList(){
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(5);
		ListNode third = new ListNode(10);
		ListNode fourth = new ListNode(15);
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = first;
		last = fourth;

	}
	// Display
	public void display(){
		if(last == null){
			return;
		}
		ListNode first = last.next;
		while(first != last){
			System.out.print(first.data + " ");
			first = first.next;
		}
		System.out.println(first.data + " ");
	}
	// Insert node at the beginning
	public void insertFirst(int data){
		ListNode temp = new ListNode(data);
		if(last == null){
			last = temp;
		} else {
			temp.next = last.next;
		}
		last.next = temp;
		lenght++;
	}
	// Insert node at the end
	public void insertLast(int data){
		ListNode temp = new ListNode(data);
		if(last == null){
			last = temp;
			last.next = last;
		} else {
			temp.next = last.next;
			last.next = temp;
			last = temp;
		}
		length++;
	}
	// Remove first node 
	public int removeFirst(){
		if(isEmpty()){
			throw new NoSuchElementException("Circular Singly Linked List is already empty.");
		}
		ListNode temp = last.next;
		int result = temp.data;
		if(last.next == last){
			last = null;
		} else {
			last.next = temp.next;
		}
		// temp.next = null;
		length--;
		return result;
	}
	public static void main(String[] args){
		A15_CircularSinglyLinkedList csll = new A15_CircularSinglyLinkedList();
		csll.createCircularLinkedList();
		csll.display();
		csll.insertFirst(123);
		csll.insertFirst(646);
		csll.display();
		csll.insertLast(3455);
		csll.insertLast(897);
		csll.display();
		csll.removeFirst();
		csll.removeFirst();
		csll.display();
	}
}