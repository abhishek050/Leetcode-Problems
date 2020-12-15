import java.util.*;

class Subarray{
	public static void main(String[] args){
		int[] arr = {1,2,3};
		System.out.println(subarrayK(arr,3));
		
		
	}
	
	public static int subarrayK(int[] nums, int k){
		int count = 0;
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end <= nums.length; end++) {
                int sum = 0;
                for (int i = start; i < end; i++){
                    sum += nums[i];
					
				}
				System.out.println("sum = "+sum);
				if (sum == k)
					System.out.println("if loop in  sum = "+sum);
					count++;
            }
        }
        return count;
		
		
	}
}