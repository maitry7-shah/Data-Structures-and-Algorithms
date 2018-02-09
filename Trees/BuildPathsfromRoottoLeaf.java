package Trees;

import java.util.ArrayList;
import java.util.List;

public class BuildPathsfromRoottoLeaf {
	/**
	 * Definition for a binary tree node.

	 */

	public List<String> binaryTreePaths(BTree root) {
		if(root==null)
			return null;
		StringBuilder sb=new StringBuilder();
		List<String> result=new ArrayList<String>();
		buildPaths(root,sb,result);
		 
		return result;
		
	}

	public void buildPaths(BTree root, StringBuilder sb, List<String> str){
		sb.append(root.val);	
		if(root.left==null && root.right==null ) {
			 str.add(sb.toString());
			
		}
		
		
		
	    if(root.left!=null)
	    	buildPaths(root.left,sb,str);
	    
	    
	    
	    if(root.right!=null)
	    	buildPaths(root.right,sb,str);
	   
	    sb.deleteCharAt(sb.length()-1);

	}


	


	public static void main(String[] args) {
		BTree root = new BTree(5);
		BuildPathsfromRoottoLeaf tree=new BuildPathsfromRoottoLeaf();


		root.left = new BTree(3);
		root.right = new BTree(6);
		root.left.left = new BTree(2);
		root.left.right = new BTree(4);
		root.right.right = new BTree(7);
		List<String> result = tree.binaryTreePaths(root);
		
	}

}

