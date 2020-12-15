
//The LCM of two integers is the smallest positive integer that is 
// perfectly divisible by both the numbers(without a remainder)




class Lcm{
	
	public static void main(String[] args)
	{
		lcmof(272,120);
	}
	
	public static void lcmof(int a, int b){
		
		
		int lcm = (a>b) ? a : b;
		
		while(true){
			System.out.println("lcm = "+lcm);
			if(lcm % a == 0 && lcm % b == 0){
				System.out.println("The LCM of "+a +" and " + b +" is "+lcm);
				break;
			}
			++lcm;
		}
	}		
}

