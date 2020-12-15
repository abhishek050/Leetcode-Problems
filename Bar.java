import java.util.Scanner;
class Bar{
	
	public static void findBar(int n, int[] nums){
		int max =0;
		for(int i=1;i<n;i++){
			if(max<nums[i])
				max = nums[i];
			
		}
		
		for(int i=max; i>0;i--){
			for(int j=0; j<n;j++){
				if(nums[j] >= i){
					System.out.print("*\t");
				}else{
					System.out.print("\t");
				}
			}
			System.out.println();
		}
	}
				
		
	
	public static void  main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		
		for(int i =0;i<n;i++){
			a[i] = sc.nextInt();
		}
		
		findBar(n,a);
		
	}
}
	