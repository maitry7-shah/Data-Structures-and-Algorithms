package ArraysStrings;

public class MinimumJumpstoReachEnd {

	public static int jump(int[] A) {
        if (A.length < 2) {
            return 0;
        }
        int steps = 0;
        int distance = 0;
        int update = 0;
        for (int i = 0; i < A.length - 1; i++) {
            if (i + A[i] > distance) {
                distance = i + A[i];
            }
            if (i == update) {
                steps++;
                update = distance;
                if (distance >= A.length - 1) {
                break;
            }
            }
        }
        return steps ;
    }
	
	public static void main(String[] args) {
	    int arr[] = {1, 3, 6, 3, 2, 3, 6, 8, 9, 5};
	                
	    System.out.println("Minimum number of jumps to reach end is : "+
	    		jump(arr));
	    }
	}

