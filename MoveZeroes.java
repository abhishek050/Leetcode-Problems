import java.util.*;

class Move{
	public static void main(String[] args){
		
		int[] arr = {0,1,3,5,0,23,12};
		System.out.println(moveZeroes(arr));
	}
	public static int[] moveZeroes(int[] nums){
		int temp = 0;
		int n = nums.length;
		System.out.println("n = "+n);
		for(int i =0 ; i<n;i++){
			if(nums[i] == 0)
				temp++;
			else if (temp>0){
				int take = nums[i] ;
				nums[i] = 0;
				nums[i-temp] = take;
			}
			//for(int num: nums)
				//System.out.println(nums[num]);
		}
		int num;
		for( num =0; num<nums.length;num++)
			System.out.println("Final = :"+nums[num]);
		return nums;
					 
			
		
	}
}

			