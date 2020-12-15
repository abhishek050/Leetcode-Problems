import java.util.Scanner;

public class AnyBaseToDecimal
{
	
	public static int conversion(int x , int b){
		
		int sum = 0;
		int a = 1;
		
		while(x>0){
			int c = x%10;
			x = x/10;
			
			sum += c*a;
			a = a*b;
		}
		return sum;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(conversion(n,b));
	}
}