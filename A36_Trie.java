// Trie
public class A36_Trie{
	private TrieNode root;
	public A36_Trie(){
		root  = new TrieNode(); // Root is empty
	}
	private class TrieNode{
		private TrieNode[] children;
		private boolean isWord;
		public TrieNode(){
			this.children = new TrieNode[26]; // Storing English words
			this.isWord = false;
		}
	}
	public void insert(String word){
		if(word == null || word.isEmpty()){
			throw new IllegalArgumentException("Invalid input");
		}
		word = word.toLowerCase();
		TrieNode current = root;
		for(int i=0; i<word.length(); i++){
			char c= word.charAt(i);
			int index = c-'a';
			if(current.children[index] == null){
				TrieNode node = new TrieNode();
				current.children[index]=node;
				current=node;
			} else{ 
				currnet = current.children[index];
			}
		}
		current.isWord= true;
	}
	public boolean search(String word){
		return false;
	}
	public static void main(String[] args){
		A36_Trie t = new A36_Trie();
		t.insert("cat");
		trie.insert("cab");
		t.insert("son");
		t.insert("so");
		System.out.println("Value inserted successfully!!!");
	}
}