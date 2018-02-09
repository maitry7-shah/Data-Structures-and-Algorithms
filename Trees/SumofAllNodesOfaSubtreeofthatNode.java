package Trees;

public class SumofAllNodesOfaSubtreeofthatNode {

	public int sumofAllnodes(BTree root) {
		if(root==null)
			return 0;
		
		int left=0,right=0;
		left=sumofAllnodes(root.left);
		right=sumofAllnodes(root.right);
		
		return left+right+root.val;
		
	}
	
	
	public static void main(String[] args) {
		BTree root = new BTree(1);
		SumofAllNodesOfaSubtreeofthatNode tree=new SumofAllNodesOfaSubtreeofthatNode();


		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.right.right = new BTree(8);
		root.left.left.left = new BTree(6);
		root.right.right.right = new BTree(7);

		System.out.println("the sum of the subtree of the node is " + tree.sumofAllnodes(root));

	}
}
