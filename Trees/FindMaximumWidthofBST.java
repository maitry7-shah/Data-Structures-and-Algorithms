package Trees;
import java.util.*;

public class FindMaximumWidthofBST {

	static ArrayList<Integer> list;
	

	public void findMaximumWidth(BTree root, int level) {
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
		BTree root = new BTree(1);
		MaximumWidthofBinaryTree tree=new MaximumWidthofBinaryTree();


		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.right.right = new BTree(8);
		root.left.left.left = new BTree(6);
		root.right.right.right = new BTree(7);

		System.out.println("Maximum width is " + tree.widthOfBinaryTree(root));

		list=new ArrayList<Integer>();
		FindMaximumWidthofBST fmax=new FindMaximumWidthofBST();
		fmax.findMaximumWidth(root,0);
		
		for (int x: list) {
			System.out.println(x);
		}
	}
}
