package ArraysStrings;

public class MergeSort {
	private  int[] newArray;
	
	public  MergeSort(int size,int[] arr) {
		newArray=new int[size];
		System.arraycopy(arr, 0, newArray, 0, newArray.length);
	}
	
	public void mergeSort(int[] arr, int low, int high) {
		
		if(low<high)
		{
		int mid=(low+high)/2;
	    mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		
		int[] temp = new int[arr.length];
		System.arraycopy(newArray, 0	, temp, 0, temp.length);
		merge(temp, low, mid, high);
			
		}	
	}
	
	public void merge(int[] arr, int low, int middle, int high) {
	
		int i=low;
		int j=middle+1;
		int k=low;
		
		while(i<=middle && j<=high) {
			if(arr[i]<=arr[j]) {
				newArray[k]=arr[i];
				i++;
			}
			else {
				newArray[k]=arr[j];
				j++;
			}
			k++;
		}
		
		int length1=middle-low+1;
		int length2=high-middle-1+1;
		
		if(i==middle+1) {
			
			while(j<=high) 
				newArray[k++]=arr[j++];
		}
		else {
			
			while(i<=middle) {
				newArray[k++]=arr[i++];
			
			}	
		}
			
		
	
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		
		int[] arr= {7,2,6,9,1,3,2};
		MergeSort m=new MergeSort(7,arr);
		m.mergeSort(arr, 0,arr.length-1);
		
		for(int i=0;i<m.newArray.length;i++) {
			System.out.println(m.newArray[i]);
		}
		
 	}
}
