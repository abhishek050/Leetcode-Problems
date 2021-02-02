public class NonDecreasingArray
{
	
	public static boolean solve(int[] nums)
	{
		int cnt = 0;                                                                    //the number of changes
        for(int i = 1; i < nums.length && cnt<=1 ; i++){
            if(nums[i-1] > nums[i]){
                cnt++;
                if(i-2<0 || nums[i-2] <= nums[i])nums[i-1] = nums[i];                    //modify nums[i-1] of a priority
                else nums[i] = nums[i-1];                                                //have to modify nums[i]
            }
			for(int j =0; j<nums.length; j++){
				System.out.print(" "+ nums[j]);
			}
			System.out.println();
        }
		for(int j =0; j<nums.length; j++){
				System.out.print(" "+ nums[j]);
		}
		return cnt<=1; 
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {-1,4,2,3};
		System.out.println(solve(arr));
	}
	


	
}




		