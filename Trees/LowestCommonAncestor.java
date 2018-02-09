package Trees;
public class LowestCommonAncestor {

	public TreeNode findLCA(TreeNode root, int A, int B) {
		if(root==null)
			return null;
		
		if(root.val==A || root.val== B)
			return root;
		
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
		TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
		LowestCommonAncestor lca=new LowestCommonAncestor();
		TreeNode answer=lca.findLCA(root,3 ,7 );
		System.out.println(answer.val);
	}
}
