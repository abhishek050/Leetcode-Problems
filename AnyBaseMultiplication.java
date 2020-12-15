import java.util.Scanner;

class AnyBaseMultiplication{
	
	public static int baseMultiplication(int num1 ,int num2,int base){
		int p =1;
		int sum =0;
		while(num2>0){
			int a1 = num2%10;
			num2  = num2/10;
			int a2 = singleMultiplication(num1,a1 ,base);
			sum = additionTo(sum , a2*p,base);
			p = p*10;
			System.out.println("sum = "+sum);
		}
		return sum;
	}
	public static int singleMultiplication(int n1 , int n2, int base){
		int sum =0;
		int carry=0;
		int p =1;
		while(n1>0 || carry>0){
			int x1= n1%10 ;
			System.out.println("x1 = "+x1);
			n1 = n1/10;
			
			
			int a = (x1*n2)+carry; 
			System.out.println("a = "+a);

			carry = a/base;
			a = a%base;
		    sum = sum+a*p;
			

			p *= 10;
		}
		return sum;
	}
	
	public static int additionTo(int n1, int n2, int base){
		int cary = 0;
		int sum =0;
		int c =1;
		System.out.println("n1 = "+n1);
		System.out.println("n2 = "+n2);
		
		while(n1>0 || cary>0 || n2>0){
			int a = n1%10 + cary;
			n1 = n1/10;
			int b = n2%10;
			n2 = n2/10;
			int unit = (a+b)%base;
			cary = (a+b)/base;
			unit = unit*c;
			if(cary >0 && n1 ==0){
				sum += unit+(cary*(c*10));
				return sum;
			}
			sum += unit;
			System.out.println("sum in additionTo = "+sum);
			c = c*10;
		}
		return sum;
	}
			
	
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(baseMultiplication(n1,n2,b));
	}
}

