package Trees;

import java.util.List;

public class PrintOddLevels {

	public void printOddLevels(BTree node,int level){
		
		if(level%2!=0)
		System.out.println(node.val);
			
		if(node.left!=null)
			printOddLevels(node.left,level+1);
		
		if(node.right!=null)
			printOddLevels(node.right,level+1);

	}
	
	
	public static void main(String[] args) {
		BTree root = new BTree(1);
		PrintOddLevels tree=new PrintOddLevels();

		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.right.right = new BTree(8);
		root.left.left.left = new BTree(6);
		root.right.right.right = new BTree(7);

		tree.printOddLevels(root,0);

	}
}
