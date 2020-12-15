import java.util.*;
class Solution4 {
    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[2*n];
		for(int i = 0; i < n; i++){
			res[2 * i] = nums[i]; //even
			System.out.println("nums[i] = "+nums[i]);
			System.out.println("arr[2i] = "+res[2*i]);
			res[2 * i + 1] = nums[n+i]; //odd
			System.out.println("nums[n+i] = "+nums[n+i]);
			System.out.println("arr[2i+1] = "+res[2*i]+1);
		}
		
         return res;
    }

	
	public static void main(String[] args){
		int[] ar = {2,5,1,3,4,7};
		shuffle(ar,3);
	}
}