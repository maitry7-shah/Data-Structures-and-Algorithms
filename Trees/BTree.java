package Trees;

public class BTree{
	public int val;
	public BTree right;
	public BTree left;
	
	public BTree(int v){
		this.val=v;
		this.right=null;
		this.left=null;
	}
	
	public BTree(TreeNode t,TreeNode right,TreeNode left){
	
		t.right=right;
		t.left=left;
	}
}