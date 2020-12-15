 import java.util.Scanner;
 
 public class AnyBaseSubtraction{
	 
	 public static int subtractionTO(int n1, int n2, int base){
		 int temp = 0;
		 if(n1<n2){
			 temp = n1;
			 n1 = n2;
			 n2 = temp;
		 }
		 System.out.println("n1=" +n1);
		 System.out.println("n2=" +n2);
		 
		 
		 
		 int c =1;
		 int sum =0;
		 int cary =0;
		 while(n1>0){
			 int a = (n1%10);
			 System.out.println("a=" +a);
			 int b = n2%10;
			 System.out.println("b=" +b);
			 n1 = n1/10;
			 n2 = n2/10;
			 a += cary;
			 int d=0;
			 if(a>=b){
				 cary =0;
				 System.out.println("carry=" +cary);
				  d= a-b;
				 
			 }
			 else{
				 cary =-1;
				 d= a+base-b;
			 }
			 
			 
			 
			 
			 sum += (d*c);
			 System.out.println("sum = " +sum);
			 c *= 10;
		 }
		 return sum;
	 }
			 
			 
	 
	 public static void main(String[] args){
		 
		 Scanner sc = new Scanner(System.in);
		 int n1 = sc.nextInt();
		 int n2 = sc.nextInt();
		 int b = sc.nextInt();
		 
		 System.out.println(subtractionTO(n1,n2,b));
	 }
 }
 