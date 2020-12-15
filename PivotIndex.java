import java.util.*;
class Solution5 {
    public static int pivotIndex(int[] nums) {
         int total = 0, sum = 0;
        for (int num : nums) total += num;
        for (int i = 0; i < nums.length; i++){
			
            if (sum * 2 == total - nums[i]) return i;
			sum += nums[i];
		}
	
        return -1;  
        
    }
	
	public static void main(String[] args){
		int[] arr = {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
	}
}