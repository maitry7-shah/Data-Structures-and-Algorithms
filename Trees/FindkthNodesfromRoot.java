package Trees;
import java.util.*;

public class FindkthNodesfromRoot {

	public void  findNodesfromRoot(TreeNode root, int k) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		q.add(root);
		
		
		while(!q.isEmpty()) {
//			int temp=q.poll();
			
		}
		
		
		
	}
	
public static void main(String args[]) {
		
	TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
	TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
	TreeNode treenode=new TreeNode(5, treeleft,treeright);
	FindkthNodesfromRoot obj=new FindkthNodesfromRoot();
	obj.findNodesfromRoot(treenode, 2);
	}
}
