package Trees;
import java.util.*;

public class FindkthNodesfromRoot {

	public void  findNodesfromRoot(TreeNode root, int k) {
		if(root==null)
			return;
		
		if(k==0)
			System.out.println(root.val);
		
		
		
		

	}
	
public static void main(String args[]) {
		
	TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
	TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
	TreeNode treenode=new TreeNode(5, treeleft,treeright);
	FindkthNodesfromRoot obj=new FindkthNodesfromRoot();
	obj.findNodesfromRoot(treenode, 2);
	}
}
