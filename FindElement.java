import java.util.Scanner;

class FindElement{
	
	public static int find(int n, int[] nums, int x){
		
		for(int i=0;i<n;i++){
			if(nums[i] == x)
				return i;
		}
		return -1;
	}
	
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		int f = sc.nextInt();
		System.out.println(find(n,a,f));
	}
}
		