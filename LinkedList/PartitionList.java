package LinkedList;
 class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
 
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
	    ListNode dummy1 = new ListNode(0), dummy2 = new ListNode(0);  //dummy heads of the 1st and 2nd queues
	    ListNode curr1 = dummy1, curr2 = dummy2;      //current tails of the two queues;
	    while (head!=null){
	        if (head.val<x) {
	            curr1.next = head;
	            curr1 = head;
	        }else {
	            curr2.next = head;
	            curr2 = head;
	        }
	        head = head.next;
	    }
	    curr2.next = null;         
	    curr1.next = dummy2.next;
	    return dummy1.next;
	}
	
	public void print(ListNode head) {
		while(head!=null) {
			System.out.println(head.val);
			head=head.next;
		}
	}
	
	public static void main(String[] args) {
		PartitionList p=new PartitionList();
		ListNode llist = new ListNode(1);
        llist.next=new ListNode(3);
        llist.next.next=new ListNode(2);
        llist.next.next.next=new ListNode(4);
        llist.next.next.next.next=new ListNode(2);
        llist.next.next.next.next.next=new ListNode(5);
		ListNode ans=p.partition(llist, 3);
		p.print(ans);
	}
	
}
