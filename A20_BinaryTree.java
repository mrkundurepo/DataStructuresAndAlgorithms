// Binary Search Tree
public class A20_BinaryTree{
	public TreeNode root;
	private class TreeNode{
		private int data;
		private TreeNode left;
		private TreeNde right;
		public TreeNode(int data){
			this.data = data;
		}
	}
	// Insert a value in a binary search tree (recursive approach)
	public void insert(int value){
		root = insert(root, value);
	}
	public TreeNode insert(TreeNode root, int value){
		if(root == null){
			root = new TreeNode(value);
			return root;
		}
		if(value < root.data){
			root.left = insert(root.left, value);
		} else {
			root.right = insert(root.right, value);
		}
		return root;
	}
	public void inOrder(){
		inOrder(root);
	}
	public void inOrder(TreeNode root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	// Search a given key
	public TreeNode search (int key){
		return search(root, key);
	}
	public TreeNode search(TreeNode root, int key){
		if(root == null || root.data == key){
			return root;
		}
		if(key < root.data){
			return search(root.left, key);
		} else {
			return search(root.right, key);
		}
	}
	// Validate binary seearch tree
	public boolean isValid(TreeNode root, long min, long max){
		if(root == null){
			return true;
		}
		if(root.val <= min || root.val >= max){
			return false;
		}
		boolean left = isValid(root.left, min, root.val);
		if(left){
			boolean right = isValid(root.right, rool.val, max);
			return right;
		}
		return false;
	}
	public static void main(String[] args){
		A20_BinaryTree bst = new A20_BinaryTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(1);
		bst.insert(4);
		bst.insert(7);
		bst.inOrder();
		if(null != bst.search(4)){
			System.out.println("Key found !!!");
		} else {
			System.out.println("Key not found !!!");
		}
	}
}