package Sorting;

public class WiggleSort {

    public void wiggleSort(int[] nums) {
        for(int i=0;i<nums.length;i++)
            if(i%2==1){
               if(nums[i-1]>nums[i]) 
            	   swap(nums, i);
            }
            else if(i!=0 && nums[i-1]<nums[i]) 
            	swap(nums, i);
        System.out.println("qq");
    }
    
    public void swap(int[] nums, int i){
          int tmp=nums[i];
          nums[i]=nums[i-1];
          nums[i-1]=tmp;
    }
    
    public static void main(String[] args) {
    		int[] arr= {3,5,1,6,3,9,8};
    		WiggleSort w=new WiggleSort();
    		w.wiggleSort(arr);
    }
}
