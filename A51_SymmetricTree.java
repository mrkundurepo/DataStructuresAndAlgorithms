// Symmetric Tree
public class A51_SymmetricTree{
	public boolean isSymmetric(TreeNode root){
		if(root == null){
			return true;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root.left);
		stack.push(root.right);
		while(!stack.isEmpty()){
			TreeNode n1 = stack.pop();
			TreeNode n2 = stack.pop();
			if(n1 == null && n2 == null) continue;
			if(n1 == null || n2 == null || n1.val != n2.val) return false;
			stack.push(n1.left);
			stack.push(n2.right);
			stack.push(n1.right);
			stack.push(n2.left); 
		}
		return true;
	}
	public static void main(String[] args){
		A51_SymmetricTree st = new A51_SymmetricTree();

	}
}