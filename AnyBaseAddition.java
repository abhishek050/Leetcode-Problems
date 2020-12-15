import java.util.Scanner;

public class AnyBaseAddition{
	
	public static int additionTo(int n1, int n2, int base){
		int cary = 0;
		int sum =0;
		int c =1;
		while(n1>0){
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
			c = c*10;
		}
		return sum;
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		
		int n2 = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(additionTo(n1,n2,b));
	}
}

