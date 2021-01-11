import java.util.*;

class Solution {
    public static int solve(ArrayList<Integer> A, int B) {
        
        
		int count3 = 0;

        int n = A.size();
        for(int i =0; i<n ; i++){
			List<Integer> li = new ArrayList<>();
			li.add(A.get(i));
			if(B == 1 ){count3++;}
			int count2 = 0;
			for(int j = i+1; j<n;j++){
				
				int k = A.get(j);
				//System.out.println("k = "+k);
				
				li.add(k);
				
				int m =0;
				System.out.println("li = "+li);
				//System.out.println("li.size = "+li.size());
				int count = 0;
				

				while(m<li.size()){
					
					//System.out.println("I m in");
					//System.out.println("li.get("+m+") = " + li.get(m));
					
					if(k == li.get(m)){
						count++;
						//System.out.println("COunt ="+count);
					}
					m++	;
					if(count == B){
						count2++;
				    }
					//System.out.println("Count2 = "+count2);
				}
				
			}
			if(count2 >= B){
					count3++;
				}
        }
		return count3;
        
    }
	
	public static void main(String[] args)
	{
		ArrayList<Integer> li = new ArrayList<Integer>();
		li.add(1);
		li.add(1);
		li.add(1);
		li.add(2);
		li.add(2);
	
		
		int c = 1;
		System.out.println(solve(li,c));
	}
		
}


/*
A = [1,2,3,1,2,3]
B = 2

*/

