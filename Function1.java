package PepCoding;
import java.util.Scanner;

public class Function1{
	
	public static int nFact(int x){
		int infact = 1;
		for(int i =1 ; i<=x; i++)
			infact *= i;		
		return infact;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		
		int nfact = nFact(n);
		int nmrfact = nFact(n-r);
		
		int npr = nfact / nmrfact;
		System.out.println(n+ "p" +r + "="+npr);
	}
		
}


