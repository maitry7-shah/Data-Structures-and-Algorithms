package LinkedList;

public class Node {

	int val;
	Node next;
	
	public Node(int number) {
		
	     val=number;
		 next=null;
	}
	
	public Node addNode(Node head, int number) {
		Node newNode=new Node(number);
		 head.next=newNode;
		return head;
	}
	
	
	
}
