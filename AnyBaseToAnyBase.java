import java.util.Scanner;
//import java.lang.Math;

public class AnyBaseToAnyBase{
	
	public static int conversionFrom(int x , int b1 , int b2){
		int dec = AnyBaseToDecimal(x,b1);
		int dn = DecimalToAnyBase(dec,b2);
		return dn;
	}
	public static int DecimalToAnyBase(int x , int b){
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
	
	public static int AnyBaseToDecimal(int x , int b){
		
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
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int b1 = sc.nextInt();
		int b2 = sc.nextInt();
		
		System.out.println(conversionFrom(n,b1,b2));
	}
}

