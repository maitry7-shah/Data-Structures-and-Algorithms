package Trees;

public class sumofSubTree {

		public int sumofSubTree(TreeNode root) {
			if(root==null)
				return 0;
			
			int left=0,right=0;
			left=sumofSubTree(root.left);
			right=sumofSubTree(root.right);
			
			return left+right+root.val;
		
		}
		
		
		public static void main(String args[]) {
			TreeNode root = new TreeNode(1);
	        root.left = new TreeNode(2);
	        root.right = new TreeNode(3);
	        root.left.left = new TreeNode(4);
	        root.left.right = new TreeNode(5);
	        root.right.left = new TreeNode(6);
	        root.right.right = new TreeNode(7);
	        sumofSubTree tt=new sumofSubTree();
			System.out.println(tt.sumofSubTree(root));
			
		}
	}

