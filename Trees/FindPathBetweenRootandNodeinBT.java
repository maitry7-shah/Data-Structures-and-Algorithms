package Trees;
import java.util.*;

public class FindPathBetweenRootandNodeinBT {

	static ArrayList<Integer> l;

	public void findPath(TreeNode root, int destinationRootValue) {
		
		if(root==null)
			return;
		
		if(l.size()==0)
			findPath(root.left,destinationRootValue);
			if(l.size()==0)
			findPath(root.right,destinationRootValue);
		
		if(l.size()>0)
			l.add(root.val);
		else if(root.val==destinationRootValue) {
			l.add(root.val);		
		}
		
	}
	
	public static void main(String args[]) {
		TreeNode treeleft=new TreeNode(3,new TreeNode(1,null,null),new TreeNode(4,null,null) );
		TreeNode treeright=new TreeNode(7,new TreeNode(6,null,null),new TreeNode(8,null,null) );
		TreeNode treenode=new TreeNode(5, treeleft,treeright);
		FindPathBetweenRootandNodeinBT fpb=new FindPathBetweenRootandNodeinBT();
		l=new ArrayList<Integer>();
	
		fpb.findPath(treenode, 6);

	}
}
