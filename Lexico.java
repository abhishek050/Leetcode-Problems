import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main2 {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int m = sc.nextInt();

		System.out.println(lexico(k,m));
	}
	public static int lexico(int k,int m){
		Vector<String> s = new Vector<String>();
		for(int i =2; i<1000; i++){
			System.out.println("i = "+i);
			for (int j = 1; j <= i; j++)
			{
				s.add(String.valueOf(j));
				
			}
			Collections.sort(s);
			Vector<Integer> ans = new Vector<Integer>();
			for (int o= 0; o <i; o++){
				ans.add(Integer.valueOf(s.get(o)));
			}
			System.out.println("s = "+s);
			System.out.println("ans = "+ans);
			int a = ans.indexOf(k);
			System.out.println("a = "+a);
			if(ans.indexOf(k) == m){
				return i-1;
			}
			
			s.clear();
			ans.clear();
		}
		
 
    	
			

		return 0;
	}
}