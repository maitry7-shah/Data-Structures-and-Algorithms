package Heap;

import java.util.*;

class Heap{
	int capacity;
	ArrayList<Integer> array;
	
	Heap(int cap){
		capacity=cap;
		array=new ArrayList<Integer>();
	}
	

	public int getParent(int index) {return (index-1)/2;}
	
	public  void insert(int num) {
		
		array.add(num);
		int childIndex=array.size()-1;
		int parentIndex=getParent(childIndex);
		while(array.get(getParent(childIndex))>num) {
			Collections.swap(array, parentIndex, childIndex);
			
			childIndex=parentIndex;
		}
	} 
	
public  void heapify(int i) {
		
	 int l = 2*(i)+1;
	    int r = 2*(i)+2;
	    int smallest = i;
	    if (l < array.size() && array.get(l) < array.get(i))
	        smallest = l;
	    if (r < array.size() && array.get(r) < array.get(smallest))
	        smallest = r;
	    
	    if (smallest != i)
	    { Collections.swap(array, i, smallest);
	     
	        heapify(smallest);
	    }
	}
	
	
	
}

public class SortNearlySortedArray {

	public static void main(String args[]) {
		
		int[] a= {2, 6, 3, 12, 56, 8};
		
		Heap heap=new Heap(a.length);
		
		for(int i=0;i<a.length;i++) {
			heap.insert(a[i]);
		}
//		for(int i=0;i<a.length;i++) {
//			//heapify(heap,i);
//        
//		}
//		
		for(int i=0;i<a.length;i++) {
			System.out.println(heap.array.get(i));
		}
	}
}
