import java.util.Scanner;

class ReverseNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		
		reverseno(a);
	}
	
	
	public static void reverseno(int n){
		int reverse =0;
		while(n>0){
		
			System.out.println("n = "+n);
			int b = n%10;
			System.out.println("b = "+b);
			reverse = reverse * 10+b;
			
			n = n/10;
			
			
		}
		System.out.println(reverse);
	}
		
		
}
	