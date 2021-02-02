
import java.util.*;

class Solution4 {
    public static void finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
		for(int i =0; i<prices.length;i++)
		{
			while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
				//System.out.println("prices[stack.peek()] =  "+prices[stack.peek()]);
				//System.out.println("prices["+i+"] = "+prices[i]);
                prices[stack.pop()] -= prices[i];
				//System.out.println("prices[stack.pop()] = "+ prices[stack.pop()] );
			}
			System.out.println(" i = "+i);
            stack.push(i);
		
		}
		
        for(int k =0; k<prices.length;k++){
            System.out.println(prices[k]);
        }
        
    }
    
    public static void main(String[] args){
        int[] arr = {10,1,1,6};
        finalPrices(arr);
    }
}