package Trees;

import java.util.*;
public class LevelOrderTraversal {

	void performLevelOrderTraversal(TreeNode root) {
		Queue<TreeNode> q=new LinkedList<TreeNode>();
		if(root==null)
			return;
		q.add(root);
		
		while(!q.isEmpty()) {
			TreeNode temp=q.poll();
			System.out.println(temp.val);
			if(temp.left!=null)
				q.add(temp.left);
				
			if(temp.right!=null)
				q.add(temp.right);
		}
	}

	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		LevelOrderTraversal lvt=new LevelOrderTraversal();
		lvt.performLevelOrderTraversal(treenode);
	}
}
