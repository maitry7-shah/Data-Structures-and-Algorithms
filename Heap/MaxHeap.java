package Heap;

public class MaxHeap {
	 private int heapSize;
	 private int[] heap;

	 MaxHeap(int heapCapacity){
		 heapSize=0;
		 heap=new int[heapCapacity];
	 }
	 
	 public void insert(int num) {
		 if(heapSize!=heap.length)
		 heap[heapSize++]=num;
		 else
			 System.out.println("Overflow");
		 heapifyDwn(heapSize);	 
	 }
	 
	 public int getParentIndex(int index) {
		 return (index-1)/2;
	 }
	 
	 public void heapifyDwn(int heapSize) {
		 int i=heapSize-1;
		 int temp;
		// int parentIndex=getParentIndex(i);
		while(i!=0 && heap[getParentIndex(i)]< heap[i]) {
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
		MaxHeap maxHeap=new MaxHeap(10);
		maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.printHeap();
		
	}
}
