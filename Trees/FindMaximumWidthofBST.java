package Trees;
import java.util.*;

public class FindMaximumWidthofBST {

	static ArrayList<Integer> list;
	

	public void findMaximumWidth(TreeNode root, int level) {
		if(root==null)
			return;
		
		if(root!=null) {
			if(list.size()>level ) {
				list.set(level,list.get(level)+1);
			}
			else {
				list.add(1);
			}
			
		}
		
		findMaximumWidth(root.left, level+1);
		findMaximumWidth(root.right, level+1);
		
	}
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		list=new ArrayList<Integer>();
		FindMaximumWidthofBST fmax=new FindMaximumWidthofBST();
		fmax.findMaximumWidth(treenode,0);
		
		for (int x: list) {
			System.out.println(x);
		}
	}
}
