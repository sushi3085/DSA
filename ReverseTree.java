public class ReverseTree{
	public Node solve(Node root){
		if(root==null) return null;
		root.left = solve(root.left);
		root.right = solve(root.right);

		Node tem = root.left;
		root.left = root.right;
		root.right = tem;
		return root;
	}
}

class Node{
	int val;
	Node left;
	Node right;

	public Node(int val){this.val = val;}
	public Node(int val, Node l, Node r){this.val = val; left = l; right = r;}
}