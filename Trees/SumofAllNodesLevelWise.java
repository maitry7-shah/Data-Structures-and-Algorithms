package Trees;

import java.util.*;

public class SumofAllNodesLevelWise {

	public void sumLevelOrderTraversal(BTree root) {
		Queue<Node> n=new LinkedList<Node>();
		
		int level=0;
		Node node=new Node(root,0);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		n.add(node);
		int sum=0;
		
		int oldSum=0;
		while(!n.isEmpty()) {
			Node newNode=n.poll();
			if(arr.size()-1<newNode.level)
			{
				 oldSum=0;
			}
			else 
			{
				 oldSum=arr.get(newNode.level);
			}
			
			sum=oldSum+newNode.root.val;
			arr.add(newNode.level,sum);
		    level=newNode.level;
			if(newNode.root.left!=null) {
				n.add(new Node(newNode.root.left,newNode.level+1));}
			if(newNode.root.right!=null)
				n.add(new Node(newNode.root.right,newNode.level+1));
			oldSum=0;
			
		}
		
		
		for(int i=0;i<level+1;i++) {
			System.out.println(arr.get(i));
		}
	}
	
	
    public static void main(String args[])
    {
    	  
    	BTree root= new BTree(1);
    	root.left= new BTree(2);
    	root.right= new BTree(3);
    	root.left.left= new BTree(4);
    	root.left.right= new BTree(5);
    root.right.left= new BTree(6);
    	root.right.right= new BTree(7);
    	SumofAllNodesLevelWise s=new SumofAllNodesLevelWise();
    	s.sumLevelOrderTraversal(root);
    }
}

class Node{
	BTree root;
	int level;
	Node(BTree root,int level){
		this.root=root;
		this.level=level;}
	}



