import java.lang.Math.*;
import java.util.*;
class PiNumber{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n>15){
			System.out.println("sorry you are going out of your limit, enter again ");
			n = sc.nextInt();
		}
		
		//System.out.println("a = "+Math.PI);
		double a = Math.PI;
		String b = String.valueOf(a).replaceAll("^\\d*\\.","");
		String sting = Double.toString(a);
		char[] ch = sting.toCharArray();
		int l =0;
		while(l<ch.length)
			System.out.println("ch"+ch[l++]);
		System.out.println(a+ " /n "+b + " /n " +"string = "+sting);
		String result = "";
		String start = "3.";
		n = n+2;
		
		for(int i =0;i<n;i++){
			char digit = ch[i];
			if(i == 1)
				result = start;
			
			else{
				
				result += digit;
			}
			
		}
				
		System.out.println("result = "+result);
		sc.close();
	}
	
	
}




			