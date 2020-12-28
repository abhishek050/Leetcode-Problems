
public class HowManySmallerNumbers
{
	public static int[] calculate(int[] nums)
	{
		int n = nums.length();
		int[] arr = new int[n];
		int i =0;
		while(i<n)
		{
			int count = 0;
			for(int j = 0; j<n;j++)
			{
				if(nums[i]> nums[j])
				{
					count++;
				}
			}
			arr[i] = count;
			i++;
		}
		return arr;
	}
			
	
	
	public static void main(String[] args)
	{
		int[] arr = {8,1,2,2,3};
		System.out.println(calculate(arr));
	}
}