class StudentDoingHomework
{
	public static void main(String[] args)
	{
		int[] strtTime = {9,8,7,6,5,4,3,2,1};
		int[] endTime = {10,10,10,10,10,10,10,10,10};
		int queryTime = 5;
		
		System.out.println(homework(strtTime,endTime,queryTime));
	}
	
	public static int homework(int[] num1, int[] num2, int end)
	{
		int count=0;
		for(int i=0; i<num1.length; i++)
		{
			if((num2[i]-num1[i]) >= end){
				System.out.println("i = "+i);
				count++;
			}
		}
		return count;
		
		
	}
}