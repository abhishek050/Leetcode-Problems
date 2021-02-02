class Solution {
    public static void replaceElements(int[] nums) {
        
		for(int i =0; i<nums.length;i++)
		{
			System.out.println(" i = " +i);
			int max =0;
			for(int j =i+1; j<nums.length;j++)
			{
				
				System.out.println(" j = " +j);
				
				if(max<nums[j]){
					max = nums[j];
				}
				
				
				System.out.println("Max = "+max);
			}
			if(i == nums.length-1){
					max = -1;
				}
			
			
			int temp = max;
			nums[i] = max;
		}
        for(int i =0; i<nums.length;i++)
		{
			System.out.print(" "+nums[i]);
		}
        
    }
	
	public static void main(String[] args)
	{
		int[] arr = {17,18,5,4,6,1};
		replaceElements(arr);
	}
}