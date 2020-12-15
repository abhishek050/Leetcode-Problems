import java.util.Scanner;

public class SpanOfArray
{
	
	public static int spanOf(int n, int[] nums){
		int min =Integer.MAX_VALUE;
		int max=0;
		for(int i=0;i<n;i++){
			if(nums[i] > max){
				max = nums[i];
			}
			if(nums[i] <min){
				min = nums[i];
			}
			System.out.println("max = "+max);
			System.out.println("min = "+min);
			
		}
		
		return max-min;
		
		
	}
	
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		System.out.println(spanOf(n,a));
		
	}
}