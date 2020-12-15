import java.util.Scanner;

public class Frequency{
	
	public static int getFreq(int x , int num){
		
		int count = 0;
		while(x>0){
			int a  = x%10;
			if(a == num)
				count++;
			x = x/10;
		}
		return count;
	}
	
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int number = sc.nextInt();
		
		System.out.println(getFreq(n,number));
	}
}

	
		