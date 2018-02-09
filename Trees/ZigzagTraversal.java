package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ZigzagTraversal {
	  public List<List<Integer>> zigzagLevelOrder(BTree root) {
		    Stack<BTree> q1=new Stack<BTree>();
	        Queue<BTree> q2=new LinkedList<BTree>();
	        List<List<Integer>> outerList=new ArrayList();
	        List<Integer> flst = null;
	        List<Integer> slst = null;
	        q1.push(root);
	        boolean needToAdd = false;
	        
	        while(!q1.isEmpty() || !q2.isEmpty()){
	        	
	        		if(!q1.isEmpty()) {
	        			flst=new ArrayList<Integer>();
	        			needToAdd = true;
	        		}
	            while(!q1.isEmpty())
	            {
	            	BTree temp=q1.pop();
	                flst.add(temp.val);
	                if(temp.right!=null)
	                q2.add(temp.right);
	                if(temp.left!=null)
	                q2.add(temp.left);
	            }
	            
	            if(needToAdd) {
	            outerList.add(flst);
	            needToAdd =false;
	            }
	            // slst=new ArrayList<Integer>();
	            if(!q2.isEmpty()) {
	            slst=new ArrayList<Integer>();
	            needToAdd = true;
	            }
	            while(!q2.isEmpty())
	            {
	            	BTree temp=q2.poll();
	                slst.add(temp.val);
	                if(temp.left!=null)
	                q1.push(temp.left);
	                if(temp.right!=null)
	                q1.push(temp.right);
	            }
	           
	            if(needToAdd) {
	            outerList.add(slst);
	            needToAdd= false;
	            }
	        }
	        
	        return outerList;
	   }  
	    
	   public static void main(String[] args) {
				BTree root = new BTree(1);
				ZigzagTraversal tree=new ZigzagTraversal();
				root.left = new BTree(2);
				root.right = new BTree(3);
				root.left.left = new BTree(4);
				root.right.left = new BTree(5);
				tree.zigzagLevelOrder(root);
			}
}
