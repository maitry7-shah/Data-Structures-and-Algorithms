package LinkedList;

public class FindloopinLinkedList {
	
	
	public static int findLoop(Node head) {
		Node slow=head;
		Node fast =head;
		
		while(slow.next!= null && fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			
			if(slow==fast) {
				break;
			}
		
		}
		
		slow=head;
		while(slow!=fast) {
			slow=slow.next;
			fast=fast.next;
		}
		
		System.out.println(slow.val);
		
		return slow.val;
	}	
	
	public static void main(String[] args) {
	
		Node head = new Node(85);
		   
	    head.next = new Node(20);
	    head.next.next = new Node(15);
	    head.next.next.next = new Node(4);
	    head.next.next.next.next = new Node(10);
	 
	        // Creating a loop for testing 
	    head.next.next.next.next.next = head.next.next;
		
		int answer= findLoop(head);
		
		
		
	}
}
