// Queue 
import java.util.*;
public class A18_Queue{
	private ListNode front;
	private ListNode rear;
	private int length;
	private class ListNode{
		private int data;
		private ListNode next;
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
	}
	public int length(){
		return length;
	}
	public boolean isEmpty(){
		return lenght == 0;
	}
	public void enqueue(int data){
		ListNode temp = new ListNode(data);
		if(isEmpty()){
			front = temp;
		} else {
			rear.nect = temp;
		}
		rear = temp;
		length++;
	}
	public void print(){
		if(isEmpty()){
			return;
		}
		ListNode current = front;
		while(current != null){
			System.out.print(current.data + " ==> ");
			current = current.next;
		}
		System.out.println("null");
	}
	public int dequeue(){
		if(isEmpty()){
			throw new NoSuchElementException();
		}
		int result = front.data;
		front = front.next;
		if(front == null){
			rear = null;
		}
		length--;
		return result;
	}
	public int first(){
		if(isEmpty(){
			throw new NoSuchElementException();
		}
		return front.data;
	}
	public int last(){
		if(isEmpty(){
			throw new NoSuchElementException();
		}
	return rear.data;		
	}
	public String[] generateBinaryNumbers(int n){
		String[] result = new String[n];
		Queue<String> q = new LinkeList<>();
		q.offer("1");
		for(int i=0; i<n; i++){
			result[i] = q.poll();
			String n1 = result[i] + "0";
			String n2 = result[i] + "1";
			q.offer(n1);
			q.offer(n2);
			return result;
		}
	}
	public static void main(String[] args){
		A18_Queue queue = new A18_Queue();
		queue.enqueue(10);
		queue.enqueue(15);
		queue.enqueue(20);
		queue.enqueue(25);		
		queue.print();	
		System.out.println(queue.first());			
		System.out.println(queue.last());
		queue.dequeue();
		queue.dequeue();
		queue.print();
		System.out.println(queue.generateBinaryNumbers(5));			
	}
}