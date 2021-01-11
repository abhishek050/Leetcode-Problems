import java.util.*;
class Solution2 {
    public static int sumOddLengthSubarrays(int[] arr) {
        //List<Integer> v  = new Vector<Integer>();
        int sum = 0;
        for(int i =0; i<arr.length;i++){
            for(int j = i;j<arr.length; j++){
				List<Integer> li = new ArrayList<Integer>();
                for(int k = i; k<=j;k++){
					
                    //sum += arr[k];
					System.out.print(arr[k] +" ");
					li.add(arr[k]);
					
					//System.out.println("Sum = ");
					
                }
				if(li.size()%2 != 0){
					int m =0;
					while(m<li.size()){
						
						sum += li.get(m);
						m++;
					}
				}
				
				System.out.println();
            }
			//System.out.println("OUT OF 1 For loop");
        }
        return sum;
        
    }
	
	public static void main(String[] args){
		int[] arr={1,4,2,5,3};
		System.out.println(sumOddLengthSubarrays(arr));
	}
}