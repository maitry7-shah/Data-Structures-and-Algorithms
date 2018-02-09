package ArraysStrings;


class Node{
	int value;
	Node next;
	
	Node(int v){
		this.value=v;
		this.next=null;
	}
}

public class RemoveNthNodefromEnd {
	int k=0;
	public Node removeNthNode(Node root, int n) {
		Node current=root;
		removeNthNode(root,n, null);
		return current;
	}

	public void removeNthNode(Node root,int n, Node prev) {
		if(root==null)
			return;
		
		removeNthNode(root.next,n,root);
		
		k++;
		if(k==n)
		prev.next=root.next;
	}
	
	
	public static void main(String[] args) {
		
		RemoveNthNodefromEnd k=new RemoveNthNodefromEnd();
		Node root=new Node(1);
		root.next=new Node(2);
		root.next.next=new Node(3);
		root.next.next.next=new Node(4);
		root.next.next.next.next=new Node(5);
		root.next.next.next.next.next=new Node(6);
		k.removeNthNode(root, 3);
	}
}
