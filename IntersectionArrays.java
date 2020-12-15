
import java.util.*;

class Solution {
    public static int[] intersect(int[] num1, int[] num2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i=0; i<num1.length;i++)
		{
			if(map.containsKey(num1[i])) map.put(num1[i], map.get(num1[i])+1);
			else map.put(num1[i],1);
		}
		for(int i = 0; i < num2.length; i++)
        {
            if(map.containsKey(num2[i]) && map.get(num2[i]) > 0)
            {
                result.add(num2[i]);
                map.put(num2[i], map.get(num2[i])-1);
            }
        }
		
		int[] r = new int[result.size()];
		for(int i =0; i<result.size();i++)
		{
			r[i] = result.get(i);
			System.out.println(r[i]);
		}
		
        return r;
    }
	public static void main(String[] args){
		int[] arr = {4,9,5};
		int[] arr2 = {9,4,9,8,4};
		intersect(arr,arr2);
	
	}
}