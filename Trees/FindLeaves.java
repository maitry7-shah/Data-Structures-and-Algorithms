package Trees;
public class FindLeaves {
	
	
	public void findBTLeaves(TreeNode treenode) {
		
		if(treenode==null) {
			return ;
		}
		
		if(treenode.left ==null && treenode.right==null)
			System.out.println(treenode.val);	
		
		findBTLeaves(treenode.left);
		findBTLeaves(treenode.right);
		
	}
	
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		FindLeaves fl=new FindLeaves();
		
		fl.findBTLeaves(treenode);
		
	}
}
