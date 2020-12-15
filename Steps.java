import java.util.*;

class Steps{
	
	public static void getDistance(int a){
		int distance = 10;
		char ch = 'R' ;
		int x =0 , y=0;
		int n = 1 ;
		
		while(a>0){
			
			switch(ch){
				
				case 'R':
				System.out.println("i m in R");
				x = x+distance;
				distance = distance+10;
				ch = 'U';
				break;
				
				case 'U':
				System.out.println("i m in U");
				y = y+ distance;
				distance = distance +10;
				ch = 'L';
				break;
				
				case 'L':
				System.out.println("i m in L");
				x = x-distance;
				distance = distance+10;
				System.out.println("distance of L is :"+distance);
				ch = 'D';
				break;
				
				case 'D':
				System.out.println("i m in D");
				y = y-distance;
				distance = distance+10;
				ch = 'A';
				break;
				
				case 'A':
				x = x+distance;
				distance = distance+10;
				ch = 'R';
				break;
				
			    
			}
			System.out.println("At step "+n+"= ( "+x+","+y+" )");
			n++;
			a--;
		}
		System.out.println("x = "+ x+ ", y = "+y);
			
	}
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		getDistance(testCase);
	}
}
			