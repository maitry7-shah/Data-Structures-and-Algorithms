package Trees;

public class SmallestKthElement {
		int count=0;
		int result=0;
	
	    public int kthSmallest(BTree root, int k) {
	    		if(root==null)
	    			return 0;
	    		traverse(root,k);
	    		return result;
	    }
	    
	    public void traverse(BTree root, int k) {
	    	  
	    	  if(root.left!=null)
	    	    traverse(root.left, k);
	    	  
	    	    count ++;
	    	    if(count == k) 
	    	    	result = root.val;
	    	    
	    	    if(root.right!=null)
	    	    traverse(root.right, k);       
	    }
	  
	    
	    
	    public static void main(String[] args) {
			BTree root = new BTree(5);
			SmallestKthElement tree=new SmallestKthElement();
			//DeleteNodeInBST d=new DeleteNodeInBST();

			root.left = new BTree(3);
			root.right = new BTree(6);
			root.left.left = new BTree(2);
			root.left.right = new BTree(4);
			root.right.right = new BTree(7);
			tree.kthSmallest(root, 4);

		}
}
