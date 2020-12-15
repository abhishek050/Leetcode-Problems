import java.util.Scanner;

public class SumOfTwoArrays
{
	
	public static void sumOfArrays( int[] nums1, int[] nums2 , int[] arr){
		int carry =0;
		int i = nums1.length-1;
		int j = nums2.length-1;
		int k = arr.length-1;
		int p=1;
		while(k>=0){
			int sum =carry;
			if(i>=0){
				sum += nums1[i];
			}
			if(j>= 0){
				sum+= nums2[j];
			}
			carry = sum/10;
			sum = sum%10;
			arr[k] = sum;
			k--;
			i--;
			j--;	
		}	
		if(carry !=0 ){
			System.out.println(carry);
		}
		for(int val : arr)
			System.out.println(val);
	}
			
		
	
	public static void main(String[] args)
	{
		Scanner sc  = new Scanner(System.in);
		int n1 = sc.nextInt();
		int[] a = new int[n1];
		
		for(int i =0;i<n1;i++){
			a[i] = sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int[] b = new int[n2];
		for(int i =0;i<n2;i++){
			b[i] = sc.nextInt();
		}
		
		int[] arr = new int[n1>n2?n1:n2];
		sumOfArrays(a,b,arr);

		
	}
}