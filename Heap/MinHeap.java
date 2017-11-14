package Heap;

public class MinHeap {

	 private static final int d = 2;
	 private int heapSize;
	 private int[] heap;

	 MinHeap(int heapCapacity){
		 heapSize=0;
		 heap=new int[heapCapacity];
	 }
	 
	 public void insert(int num) {
		 if(heapSize!=heap.length)
		 heap[heapSize++]=num;
		 else
			 System.out.println("Overflow");
		 heapifyUp(num,heapSize);	 
	 }
	 
	 public int getParentIndex(int index) {
		 return (index-1)/2;
	 }
	 
	 public void heapifyUp(int num, int heapSize) {
		 int i=heapSize-1;
		 int temp;
		 
		while(i!=0 && heap[getParentIndex(i)]> heap[i]) {
			temp=heap[getParentIndex(i)];
			heap[getParentIndex(i)]=heap[i];
			heap[i]=temp;
			i=getParentIndex(i);
		}
	 }
	 
	   public void printHeap()
	    {
	        System.out.print("\nHeap = ");
	        for (int i = 0; i < heapSize; i++)
	            System.out.print(heap[i] +" ");
	        System.out.println();
	    }  
	 
	public static void main(String[] args) {
		MinHeap mp=new MinHeap(10);
		mp.insert(3);
		mp.insert(2);
		mp.insert(1);
		mp.insert(5);
		mp.insert(7);
		mp.insert(4);
		mp.insert(15);
		mp.insert(8);
		mp.insert(45);
		mp.printHeap();
		
	}
}
