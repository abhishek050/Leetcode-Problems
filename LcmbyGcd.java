//We can also use GCD to find the lcm of two numbers using the following formula
// LCM  = (a*b)/GCD;

import java.util.*;


class Lcmbygcd{
	
	public static void main(String[] args){
		
		lcmby(34,12);
	}
	
	public static void lcmby(int a, int b){
		
		int gcd = 1;
		
		for(int i =1; i<=a && i<=b ; ++i){
			System.out.println("i = "+i);
			if(a%i ==0 && b% i == 0){
				
				gcd = i;
				System.out.println("Gcd = "+gcd);
			}
		}
		int lcm = (a*b)/gcd;
		System.out.println("The LCM of "+a +" and " + b +" is "+lcm);
	}
}

		
		
