import java.util.Scanner;
import java.lang.Math;

public class ConversionDecimal{
	
	public static int conversion(int x , int b){
		int i =0;
		int sum =0;
		
		while(x>0){
			int a = x%b;
			x = x/b;
			a *= Math.pow(10,i);
			sum += a;
			i++;
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


/*

(634)base10 -------> (  )base8

8| 634 
8| 79   - 2*10^0
8| 9    - 7*10^1
8| 1    - 1*10^2
8| 0    - 7*10^3


(7113)base8

*/

