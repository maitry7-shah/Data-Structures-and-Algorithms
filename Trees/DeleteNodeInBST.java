package Trees;

public class DeleteNodeInBST {

	public void deleteNodeInBST(BTree root, int k) {
		BTree temp=null;
		if(root.val==k) {
			if(root.right!=null)
			{
				temp=root.right;
				root.right=temp;
			}

			if(root.left!=null)
				root=root.left;

		}
		if(root.left!=null)
			deleteNodeInBST(root.left, k);
		if(root.right!=null)
			deleteNodeInBST(root.right,k);


	}


	public static void main(String[] args) {
		BTree root = new BTree(5);
		MaximumWidthofBinaryTree tree=new MaximumWidthofBinaryTree();
		DeleteNodeInBST d=new DeleteNodeInBST();

		root.left = new BTree(3);
		root.right = new BTree(6);
		root.left.left = new BTree(2);
		root.left.right = new BTree(4);
		root.right.right = new BTree(7);

		d.deleteNodeInBST(root, 2);

	}

}
