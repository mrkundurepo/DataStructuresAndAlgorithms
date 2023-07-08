// Hashing data structure (hash tables)
// Collision resolution technique
public class A40_HashTable{
	// Implement hashnode
	private HashNode[] buckets;
	private int numOfBuckets;	// Capacity
	private int size;	// No of hashnodes, key-value pairs
	// Default constructor
	public A40_HashTable(){
		this(10);	// Dafualt capacity	
	}
	// Constructor
	public A40_HashTable(int capacity){
		this.numOfBuckets = capacity;
		buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}
	private class HashNode{
		private Integer key;	// Can be generic
		private String value;	// can be generic
		private HashNode next;	// reference to next hashnode
		public HashNode(Integer key, String value){
			this.key = key;
			this.value = value;
		}
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	// put key value pair in a hashtable
	public void put(Integer key, String value){
		if(key == null || value = null){
			// Edge case
			throw new IllegalArgumentException("Key or Value is null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null){
			if(head.key.equals(key)){
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HasNode node = new HashNode(key,value); 	// Key, Value -> null
		node.next = head;
		buckets[bucketIndex] = node;
	}
	private int getBucketIndex(Integer key){
		return key % numOfBuckets;	// Bucket.length
	}
	// Get a value by key 
	public String get(Integer key){
		if(key == null || value == null){
			// Edge case
			throw new IllegalArgumentException("Key is null");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while(head != null){
			if(head.key.equals(key)){
				return head.value; 
			}
			head = head.next;
		}
		return null;
	}
	// Remove key from hashtable (separate chaining)
	public String remove(Integer key){
		if(key == null){
			// Edge cases
			throw new IllegalArgumentException("Key is null!");
		}
		int bucketInde = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		// (21,"TOM")->(31,"HARRY")->(41,"SANA")->NULL
		HashNode previous = null;
		while(head != null){
			if(head.key.equals(ket)){
				break;
			}
			previous = head;
			head = head.next;
		}
		if(head == null){
			return null;
		}
		size--;
		if(previous != null){
			previous.next = head.next;
		} else {
			buckets[bucketIndex] = head.next;
		}
		return head.value;
	}
	public static void main(String[] args){
		A40_HashTable table = new A40_HashTable(10);
		table.put(105,"Tom");
		table.put(21,"Sana");
		table.put(21, "Hary");
		table.put(31,"Dinesh");
		System.out.println(table.size());
		System.out.println(table.get(31));
		System.out.println(table.get(21));
		System.out.println(table.get(90));
		System.out.println(table.remove(21));
		System.out.println(table.size());		
	}
}