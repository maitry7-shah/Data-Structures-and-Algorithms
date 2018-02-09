package Trees;

public class TreeNode {
	TreeNode left;
	TreeNode right;
	int val;
	TreeNode(int val){
		this.val=val;
		this.left=null;
		this.right=null;
	}
	
	TreeNode(int val, TreeNode left, TreeNode right){
		this.val=val;
		this.left=left;
		this.right=right;
	}
	
    
	
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
	
	}
}
