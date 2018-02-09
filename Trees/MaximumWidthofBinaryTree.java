package Trees;
import java.util.*;
public class MaximumWidthofBinaryTree {

//please look at leetcode solution!

	public int widthOfBinaryTree(BTree root) {
		Queue<BTree> q=new LinkedList<BTree>();
		q.add(root);
		int sum=0, max=Integer.MIN_VALUE;
		while(!q.isEmpty()){
			int length=q.size();
			sum=0;
			while(length>0){
				BTree newNode=q.poll();
				sum++;
				if(newNode!=null) {
				q.add(newNode.left);
				q.add(newNode.right);
				}
				length--;
			}
			if(sum>max)
				max=sum;


		}
		return sum;
	}

	public static void main(String[] args) {
		BTree root = new BTree(1);
		MaximumWidthofBinaryTree tree=new MaximumWidthofBinaryTree();


		root.left = new BTree(2);
		root.right = new BTree(3);
		root.left.left = new BTree(4);
		root.right.right = new BTree(8);
		root.left.left.left = new BTree(6);
		root.right.right.right = new BTree(7);

		System.out.println("Maximum width is " + tree.widthOfBinaryTree(root));

	}

}
