import java.util.Scanner;

class PrimeNo{
	
	public static void prime(int n){
		int count =0;
		
		for(int i =2; i<=n;i++){
			if(n%i ==0){
				count++;
				System.out.println(" n , i : "+n +i);
			}
		}
		if(count == 1){
			System.out.println("Enter no. is prime");
		}
		else{
			System.out.println("Enter no.is not a prime no");
		}
	}
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int n = sc.nextInt();
		
		if(n>0){
			System.out.println("h");
			prime(n);
		}
		else{
			System.out.println("Please enter the positive number");
		}
	}
}

		