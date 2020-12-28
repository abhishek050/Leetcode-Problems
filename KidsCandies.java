import java.util.*;

public class KidsCandies
{
	public static void distribute(int[] nums, int e)
	{
		int n = nums.length;
		List<Boolean> li = new ArrayList<Boolean>(n);
		int max =0;
		for(int i=0; i<nums.length;i++)
		{
			max = Math.max(nums[i],max);
		}
		for(int j =0; j<nums.length;j++)
		{
			int candies = nums[j] +3;
			if(candies>= max)
				li.add(true);
			else
				li.add(false);
		}
		
		System.out.println(li);
	
			
		
		
	}
	
	
	
	public static void main(String[] args)
	{
		int[] arr = {2,3,5,1,3};
		int extraCandies = 3;
		distribute(arr,extraCandies);
	}
}