package Trees;
public class FindDistancebetweenTwoNodes {
 
	public int findDistancebetweenTwoNodes(TreeNode root,int m, int n) {
		TreeNode lca= findLCA(root,m,n);
		if(lca!=null) {
			int d1=findDistance(lca,m);
			int d2=findDistance(lca,n);
			return d1+d2-2;
		}
		return -1;
		
	}
	
	
	public int findDistance(TreeNode lca, int m){
		int distance = 0;
		
		if(lca==null)
			return 0;
		
		
		if(distance==0)
		 distance = findDistance(lca.left,m);
		if(distance==0)
		distance = findDistance(lca.right,m);
		
		
		
		if(distance>0)
			distance++;  
		else if (lca.val==m)
		distance=1;
		
		
		
		return distance;
	}
	
	public TreeNode findLCA(TreeNode root, int m, int n) {
		
		if(root==null)
			return null;
		
		if(root.val==m || root.val==n)
			return root;
		
		TreeNode left=findLCA(root.left,m,n);
		TreeNode right=findLCA(root.right,m,n);
		
		if(left != null && right!=null)
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
		FindDistancebetweenTwoNodes fd=new FindDistancebetweenTwoNodes();
		
		int distance=fd.findDistancebetweenTwoNodes(treenode, 1, 5);
		System.out.println(distance);
	}
}
