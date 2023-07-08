// Priority Queue and Binary Heap
// Bottom-up reheapify (swim) in max heap
public class A22_PriorityQueue{
	// Represent a binary heap
	private Integer[] heap; // generic type
	private int n;	// Size of max heap
	public A22_PriorityQueue(int capacity){
		heap = new Integer[capacity + 1];	// Index 0 is kept as empty
		n = 0;
	}
	public boolean isEmpty(){
		return n == 0;
	}
	public int size(){
		return n;
	}
	public void insert(int x){
		if(n == heap.length - 1){
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
	}
	private void resize(int capacity){
		Integer[] temp = new Integer[capacity];
		for(int i=0; i<heap.length; i++){
			temp[i] = heap[i];
		}
		heap = temp;
	}
	private void swim(int k){
		while(k > 1 && heap[k/2] < heap[k]){
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; 	// we need to contiue shifting up till new value inserted at the correct position
		}
	}
	public void printMaxHeap(){
		for(int i=1; i<=n; i++){
			System.put.print(heap[i] + " ");
		}
	}
	public int deleteMax(){
		int max = heap[1];
		swap(1,n);
		n--;
		sink(1);
		heap[n+1] = null;
		if(n>0 && (n==(heap.length-1)/4)){
			resize(heap.length/2);
		} 
		return max;
	}
	private void sink(int k){
		while(2*k <= n){
			int j=2*k;
			if(j<n && heap[j]<heap[j+1]){
				j++;
			}
			if(heap[k]>=heap[j]){
				break;
			}
			swap(k,j);
			k=j;
		}
	}
	public void swap(int a, int b){
		int temp = heap[a];
		heap[a] = heap[b];
		heap[b] = temp;
	}
	public static void main(String[] args){
		A22_PriorityQueue pq = new A22_PriorityQueue(3);
		System.out.println(pq.size());	// 0
		System.out.println(pq.isEmpty());	// True
		pq.insert(4);
		pq.insert(5);
		pq.insert(2);
		pq.insert(6);
		pq.insert(1);
		pq.insert(3);
		System.out.println(pq.size());
		pq.printMaxHeap();
	}
}