import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		char s1 = sc.next().charAt(0);
		char s2 = sc.next().charAt(0);
		System.out.println(whoWon(s1,s2));
	}
	public static char whoWon(char c1, char c2)
	{
		if(c1 == 'R' || c2=='R'){
			return 'R';
		}
		else if(c1 == 'j' ){
			return c2;
		}else if(c2 == 'J'){
			return c1;
		}

		return 'D';
	}
}