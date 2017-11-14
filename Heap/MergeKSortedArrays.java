package Heap;

import java.util.*;

class Element{
	int val;
	int index;
	int listNumber;
	
	Element(){
		val=0;
		index=0;
		listNumber=0;
	}
}

public class MergeKSortedArrays {
	 
	
	
	public static ArrayList<Integer> mergeArrays(List<ArrayList<Integer>> lists) {
		int index=0, listNumber=0;
		ArrayList<Integer> result=new ArrayList<Integer>();
		PriorityQueue<Element> pq=new PriorityQueue<Element>(new Comparator<Element>(){
            public int compare(Element a, Element b){
                if (a.val > b.val) return 1;
                if (a.val == b.val) return 0;
                return -1;
            }
        }); 
		
		for(ArrayList<Integer> list:lists) {
			Element e1=new Element();
			e1.val=list.get(index);
			e1.index=index;
			e1.listNumber=listNumber++;
			pq.add(e1);
		}
		
		index=0; listNumber=0;
		while(!pq.isEmpty()) {
			Element element=pq.poll();
			result.add(element.val);
			index=element.index;
			listNumber=element.listNumber;
			Element newElement=new Element();
			newElement.listNumber=listNumber;
			
			if(index+1<lists.get(listNumber).size())
			{
				newElement.index=index+1;
				newElement.val=lists.get(listNumber).get(newElement.index);
				pq.add(newElement);
			}
			/*else {
				
				newElement.listNumber=listNumber;
				newElement.val=Integer.MAX_VALUE;
			}*/
			
			
			
		}
		
		return result;
	}

	public static void printArray(ArrayList<Integer> sortedArrays) {
		for(Integer i : sortedArrays)
		System.out.println(i);
	}
	
	public static void main(String args[]) {
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		arr1.add(1);
		arr1.add(3);
		arr1.add(5);
		arr1.add(7);
		ArrayList<Integer> arr2=new ArrayList<Integer>();
		arr2.add(2);
		arr2.add(4);
		arr2.add(6);
		arr2.add(8);
		ArrayList<Integer> arr3=new ArrayList<Integer>();
		arr3.add(0);
		arr3.add(9);
		arr3.add(10);
		arr3.add(11);
		
		List<ArrayList<Integer>> lists=new ArrayList<ArrayList<Integer>>();
		lists.add(arr1);
		lists.add(arr2);
		lists.add(arr3);
		ArrayList<Integer> sortedArrays=mergeArrays(lists);
		printArray(sortedArrays);
	}
}
