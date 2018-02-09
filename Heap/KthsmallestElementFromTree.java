package Heap;

import java.util.PriorityQueue;

import Trees.BTree;


public class KthsmallestElementFromTree {
	
	public int smallest(BTree root,int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(); 
		add( root, pq);
		int length=pq.size();
		
		if(length<k) return -1;
		
		while(k>0) {
			pq.poll();
			k--;
		}
		
		return pq.poll();
	}
	
	public void add(BTree root, PriorityQueue<Integer> pq) {
		
		if(root==null)
			return;
		
		if(root.left!=null)
			add(root.left,pq);
		
		if(pq.size()>0) {
			if(pq.peek()!=root.val)
				pq.add(root.val);
		}
		else{
			pq.add(root.val);
		}
		
		
		if(root.right!=null)
			add(root.right,pq);
		
	}
	
	public static void main(String[] args) {
		KthsmallestElementFromTree k=new KthsmallestElementFromTree();
		BTree root = new BTree(2);
	
		root.left = new BTree(2);
		root.right = new BTree(2);
		
		k.smallest(root, 2);
		
	}
}
