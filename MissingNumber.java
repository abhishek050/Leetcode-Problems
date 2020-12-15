class Solution5{
	public static void main(String[] args){
		
		int[] nums = {9,6,4,2,3,5,7,0,1};
		int sum = 0;
		for(int i:nums){
			sum +=i;
		}
		
		int n = nums.length+1;
		System.out.println("("+n+"*("+(n-1)+"/"+"2)-"+sum);
		int a = (n*(n-1)/2);
		System.out.println("a = "+90/2);
		System.out.println((n*(n-1)/2)-sum);
		
	}
}
