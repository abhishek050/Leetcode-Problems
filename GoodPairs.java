public class GoodPairs
{
	public static int numberOfGood(int[] nums)
	{
		int count = 0;
		int n = nums.length;
		for(int i =0; i<n; i++)
		{
			for(int j = 1; j<n; j++)
			{
				if(nums[i] == nums[j] && i<j)
				{
					count++;
				}
			}
		}
		return count;
		
		
	}
	
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,1,1,3};
		System.out.println(numberOfGood(arr));
	}
}