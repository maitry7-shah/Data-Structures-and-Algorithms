package ArraysStrings;

import java.util.HashMap;

class DoubleLinkedNode{
	    int key;
	    int value;
	    DoubleLinkedNode pre;
	    DoubleLinkedNode next;
	 
	    public DoubleLinkedNode(int key, int value){
	        this.key = key;
	        this.value = value;
	    }
	}
	
public class LRUCache {
	int capacity;
    HashMap<Integer, DoubleLinkedNode> map = new HashMap<Integer, DoubleLinkedNode>();
    DoubleLinkedNode head=null;
    DoubleLinkedNode end=null;
 
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
 
    public int get(int key) {
        if(map.containsKey(key)){
        	DoubleLinkedNode n = map.get(key);
            remove(n);
            setHead(n);
            return n.value;
        }
 
        return -1;
    }
 
    public void remove(DoubleLinkedNode n){
        if(n.pre!=null){
            n.pre.next = n.next;
        }else{
            head = n.next;
        }
 
        if(n.next!=null){
            n.next.pre = n.pre;
        }else{
            end = n.pre;
        }
 
    }
 
    public void setHead(DoubleLinkedNode n){
        n.next = head;
        n.pre = null;
 
        if(head!=null)
            head.pre = n;
 
        head = n;
 
        if(end ==null)
            end = head;
    }
 
    public void set(int key, int value) {
        if(map.containsKey(key)){
        	DoubleLinkedNode old = map.get(key);
            old.value = value;
            remove(old);
            setHead(old);
        }else{
        	DoubleLinkedNode created = new DoubleLinkedNode(key, value);
            if(map.size()>=capacity){
                map.remove(end.key);
                remove(end);
                setHead(created);
 
            }else{
                setHead(created);
            }    
 
            map.put(key, created);
        }
    }
    
    public static void main(String[] args) {
    	LRUCache l=new LRUCache(3);
    	l.set(1, 1);
    l.set(2, 2); 
	l.set(3, 3);
	l.set(4, 4);
 	l.set(1, 3);
 	l.set(3, 3);
 	System.out.println(l.get(2));
 	l.set(4, 4);
 	System.out.println(l.get(1));
 	
    }
    


}