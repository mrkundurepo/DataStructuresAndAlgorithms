// Binary Tree
import java.util.*;
public class A19_BinaryTree{
	private TreeNode root;
	private class TreeNode {
		private TreeNode left;
		private TreeNode right;
		private int data; //Generic Type
		public TreeNode(int data){
			this.data = data;
		}
	}
	// Create binary  tree
	public void createBinaryTree(){
		TreeNode first = new TreeNode(1);
		TreeNode second = new TreeNode(2);
		TreeNode third = new TreeNode(3);				
		TreeNode fourth = new TreeNode(4);
		TreeNode fifth = new TreeNode(5);
		root = first;
		first.left = second;
		first.right = third;
		second.left = fourth;
		second.right = fifth;
	}
	// Recursive pre-order traversal 
	public void preOrder(TreeNode root){
		if(root == null){
			return;
		}
		System.out.println(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	// Iterative preorder
	public void postOrder(){
		TreeNode current = root;
		Stack<TreeNode> stack = new Stack<>();
		while(current != null || !stack.isEmpty()){
			if(current != null){
				stack.push(current);
				current = current.left;
			} else {
				TreeNode temp = stack.peek().right;
				if(temp == null){
					temp = stack.pop();
					System.out.println(temp.data + " ");
					while(!stack.isEmpty() && temp==stack.peek().right){
						temp = stack.pop();
						System.out.prinln(temp.data + " ");
					}
				} else {
					current = temp;
				}
			}
		}
	}
	// Iterate pre-order traversal of binary tree
	public void preOrderIt(TreeNode root){
		if(root == null){
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while(!stack.isEmpty()){
			TreeNode temp = stack.pop();
			System.out.println(temp.data + " ");
			if(temp.right != null){
				stack.push(temp.right);
			}
			if(temp.left != null){
				stack.push(temp.left);
			}
		}
	}
	// Recursive in-order traversal of binary tree
	public void inOrder(TreeNode root){
		if(root == null){
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+ " ");
		inOrder(root.right);
	}
	// Iterative inorder traversal of binary tree
	public void inOrderIt(TreeNode root){
		if(root == null){
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = root;
		while(!stack.isEmpty() || temp != null){
			if(temp != null){
				stack.push(temp);
				temp = temp.left;
			} else {
				temp = stack.pop();
				System.out.print(temp.data + " ");
				temp = temp.right;
			}
		}
	}
	// Level order traversal
	public void levelOrder(){
		if(root = null){
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()){
			TreeNode temp = queue.poll();
			System.out.print(temp.data + " ");
			if(temp.left != null){
				queue.offer(temp.left);
			}
			if(temp.rigt != null){
				queue.offer(temp.right);
			}
		}
	}
	// Maximum value in a binary tree
	public int findMax(){
		return findMax(root);
	}
	public int findMax(TreeNode root){
		if(root == null){
			return Integer.MIN_VALUE;
		}
		int result = root.data;
		int left = findMax(root.left);
		int right = findMax(root.right);
		if(left > result){
			result = left;
		}
		if(right > result){
			result = right;
		}
		return result;
	}

	public static void main(String[] args){
		A19_BinaryTree bt = new A19_BinaryTree();
		bt.createBinaryTree();
		bt.preOrder(bt.root);
		bt.preOrderIt(bt.root);		
		bt.inOrder(bt.root);
		bt.inOrderIt(bt.root);
		bt.preOrder();
		bt.levelOrder();
		System.out.println(bt.findMax());
	}
}