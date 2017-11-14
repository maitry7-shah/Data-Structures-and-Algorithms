package Trees;
public class FindSecondMaxElement {
	
	public int findkthmaxelement(TreeNode treenode, int k) {
		
		if(treenode.right!=null)
		k=findkthmaxelement(treenode.right, k);
		
		k=k-1;	
		if(k==0)
	    System.out.println(treenode.val);
	
		if(treenode.left!=null)
			k= findkthmaxelement(treenode.left, k);
		
		return k;
	}
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		FindSecondMaxElement fme=new FindSecondMaxElement();
		
		fme.findkthmaxelement(treenode, 6);
	
	}
}
