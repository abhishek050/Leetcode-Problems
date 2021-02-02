class Solution {
    public static int maxProduct(int[] nums) {
        int max1 = 0;
		int max2 =0;
        int i =0;
        while(i<nums.length-1){
            int j = i+1;
            max2 = (nums[i]-1)*(nums[j]-1);
			
			
            if(max2>max1){max1 = max2;}
			while(j<nums.length)
				{
					
					max2 = (nums[i]-1)*(nums[j]-1);
					j++;
					if(max2>max1)
					{
						max1 = max2;
					}
				}
				i++;
			
            
        }
        return max1;
        
    }
	
	public static void main(String[] args){
		int[] arr = {1,5,4,5};
		System.out.println(maxProduct(arr));
	}
}