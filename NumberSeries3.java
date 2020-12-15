import java.util.*;

class NumberSeries{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		int a = 0;
		int b = 0;
		System.out.println("a1="+a);
		System.out.println("b1="+b);
		//++b;
		 
		for(int i =3; i<=n;i++){
			if(i%2 == 0){
				a = a+1;
				System.out.println("a"+i+"="+a);
			}
			
			else if(i%2 !=0){
				b = b+2;
				System.out.println("b"+i+"="+b);
			}
		}
		if(n%2 == 0)
			System.out.println(a);
		else
			System.out.println(b);
	
	}
}
				
			
			
			