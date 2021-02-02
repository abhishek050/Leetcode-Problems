class Solution9 {
    public static int heightChecker(int[] heights) {
        int count =0;
        int[] arr =heights.clone();
        for(int i =0; i<heights.length-1; i++){
            for(int j = i+1; j<heights.length; j++)
			{
				if(arr[i]>arr[j]){
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
           
        }
        
        
        for(int i =0; i<arr.length; i++){
            if((heights[i]>arr[i]) || (arr[i]>heights[i])) {
                count++;
            }
        }
        return count;
		
    }
	
	
	public static void main(String[] args)
	{
		int[] nums = {1,1,4,2,1,3};
		System.out.println(heightChecker(nums));
	}
}