// SinglyLinkedList
// How to represent singly linked list
public class A11_SinglyLinkedList {
	private ListNode head;
	private class ListNode {
		private int data; 
		private ListNode next;
		private ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	// How to create a singly linked list in java	
	public static void main(String[] args){
		A11_SinglyLinkedList sll = new A11_SinglyLinkedList();
		sll.insertFirst(17);
		sll.insertFirst(8);
		sll.insertFirst(1);
		sll.insertFirst(98);
		sll.display();
		System.out.println("Length is - " + sll.length());
		sll.insertLast(112);
		sll.insertLast(11);
		sll.insertLast(189);
		sll.insertLast(345);						
		sll.display();
		System.out.println("Length is - " + sll.length());
		sll.insert(1,3);
		sll.insert(2,5);
		sll.insert(2,4);
		sll.insert(5,7);
		sll.display();
		System.out.println("Length is - " + sll.length());
		System.out.println(sll.deleteFirst().data);
		System.out.println(sll.deleteFirst().data);
		sll.display();		
		System.out.println("Length is - " + sll.length());		
		System.out.println(sll.deleteLast().data);
		System.out.println(sll.deleteLast().data);
		sll.display();		
		System.out.println("Length is - " + sll.length());		
		sll.delete(1);
		sll.delete(3);
		sll.delete(3);
		sll.display();		
		System.out.println("Length is - " + sll.length());
		sll.display(sll.head);
		if(sll.find(sll.head,112)){
			System.out.println("Search key found!!!");
		} else {
			System.out.println("Search key not found!!!");
		}
		System.out.println("This is the og list: ");
		sll.display();		
		ListNode middleNode = sll.getMiddleNode();
		System.out.println("Middle node is = " + middleNode.data);
		ListNode nthNodeFromEnd = sll.getNthNodeFromEnd(2);
		System.out.println("Nth node from end is - " + nthNodeFromEnd.data);
		sll.insertLast(11);
		sll.insertLast(11);
		sll.display();		
		sll.removeDuplicates();
		sll.display();		
		System.out.println("Length is - " + sll.length());
		sll.insertInSortedList(456);
		sll.display();		
		sll.deleteNode(456);
		sll.display();		
		System.out.println("Length is - " + sll.length());		
		ListNode reverseListHead = sll.reverse(sll.head);
		sll.display(reverseListHead);
		System.out.println("Length is - " + sll.length(reverseListHead));

	}

	// How to print elements of a singly linked list
	public void display(){
		ListNode current = head;
		while (current != null){
			System.out.print(current.data + " ==> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public void display(ListNode head){
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
	public int length(ListNode head){
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
	// How to insert node at the beginning of singly linked list
	public void insertFirst(int value){
		ListNode newNode = new ListNode(value);
		newNode.next = head;
		head = newNode;
	}
	// How to insert node at the end of singly linked list
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
	// Insert Node in a singly linked list at a given position
	public void insert(int position, int value){
		ListNode node = new ListNode(value);
		if(position == 1){
			node.next = head;
			head = node;
		} else {
			ListNode previous = head;
			int count = 1;
			while(count < position - 1){
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = node;
			node.next = current;
		}
	}
	// Delete first node of a singly linked list
	public ListNode deleteFirst(){
		if(head == null){
			return null;
		}
		ListNode temp = head;
		head = head.next;
		temp.next = null;
		return temp;
	}
	// Delete last node of a singly linked list
	public ListNode deleteLast(){
		if(head == null || head.next == null){
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		while(current.next != null){
			previous = current;
			current = current.next;
		}
		previous.next = null;
		return current;
	}
	// Delete a node from a singly linked list at a given position
	public void delete(int position){
		if(position == 1){
			head = head.next;
		} else{
			ListNode previous = head;
			int count = 1;
			while (count < position-1){
				previous = previous.next;
				count++;
			}
			ListNode current = previous.next;
			previous.next = current.next;
		}
	}
	// How to search an element in a linked list in java
	public boolean find(ListNode head, int searchKey){
		if(head == null){
			return false;
		}
		ListNode current = head;
		while(current != null){
			if(current.data == searchKey){
				return true;
			}
			current = current.next;
		}
		return false;
	}
	// How to reverse a singly linked list 
	public ListNode reverse(ListNode head){
		if(head == null){
			return head;
		}
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;
		while (current != null){
			next = current.next;
			current.next = previous; 
			previous = current;
			current = next;
		}
		return previous;
	}
	// How to find middle node in a singly linked list
	public ListNode getMiddleNode(){
		if(head == null){
			return head;
		}
		ListNode slowPtr = head;
		ListNode fastPtr = head;
		while(fastPtr != null && fastPtr.next != null){
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		} 
		return slowPtr;
	}
	// How to find the nth node from the end of a linked list
	public ListNode getNthNodeFromEnd(int n){
		if(head == null){
			return null;
		}
		if(n <= 0){
			throw new IllegalArgumentException("Invalid value: n= " + n);
		}
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while(count < n){
			if(refPtr == null){
				throw new IllegalArgumentException(n + " is greate than the number of nodes in list");
			}
			refPtr = refPtr.next;
			count++;
		}
		while(refPtr != null){
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}
	// How to remove duplicate from sorted linked list
	public void removeDuplicates(){
		if(head == null){
			return;
		}
		ListNode current = head;
		while( current!= null && current.next != null){
			if(current.data == current.next.data){
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
	}
	// How to insert a node in a sorted singly linked list
	public ListNode insertInSortedList(int value){
		ListNode newNode = new ListNode(value);
		if(head == null){
			return newNode;
		} 
		ListNode current = head;
		ListNode temp = null;
		while(current != null && current.data < newNode.data){
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
		return head;
	}
	// How to remove a given key from singly linked list
	public void deleteNode(int key){
		ListNode current = head;
		ListNode temp = null;
		if(current != null && current.data == key){
			head = current.next;
			return;
		}
		while(current != null && current.data != key){
			temp = current;
			current = current.next;
			if(current == null){
				return;
			}
			temp.next = current.next;
		}
	}


}