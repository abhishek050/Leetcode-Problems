import java.util.*;

class Twoseries{
	
	public static void main(String[] args){
		//Sint[] arr = {1,2,1,3,2,5,3,7,5,11,8,13,13,17}
		nthTerm(14);
	}
	
	public static void nthTerm( int n){
		
		
		if(n%2 == 0){
			System.out.println(even(n/2));
		}
		else
			System.out.println(odd(n/2));
	}

    
	public static int odd(int n ){
		
		
		int b =0;
		
		int c = 1;
		for(int i =2; i<=n; i++){
			
			int a  = b+c;
			b = c;
			c = a;
			
			if(i == n)
				return a;
		}
		return 0;
	}
	
	public static int even(int n){
	
		int flag  = 0;
		int k;
		int count = 0;
		for( k=1 ; k<=n; k++){
			for(int j =k+1;j<=9;j++){
				if(k%j == 0)
					count++;
			}
			if(count == 1)
				flag++;
			if(flag == n){
				return k ;
			}
		}
		return k;
	}
	
}


		
		
		
				