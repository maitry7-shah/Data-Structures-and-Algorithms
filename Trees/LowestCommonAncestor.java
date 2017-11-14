package Trees;
public class LowestCommonAncestor {

	public TreeNode findLCA(TreeNode root, TreeNode A, TreeNode B) {
		if(root==null)
			return null;
		
		if(root==A || root== B)
			return A;
		
		TreeNode left=findLCA(root.left, A,B);
		TreeNode right=findLCA(root.right, A,B);
		
		if(left!=null && right!=null)
			return root;
		
		if(left==null)
			return right;
		else
			return left;
		
	}
	
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		LowestCommonAncestor lca=new LowestCommonAncestor();
		TreeNode answer=lca.findLCA(treenode,treeright , treeleft);
		System.out.println(answer.val);
	}
}
