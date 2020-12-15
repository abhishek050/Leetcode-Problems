import java.util.*;
class Solution {
    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        dfs(li, 0, nums, new ArrayList());
        return li;
        
        
    }
    public static void dfs(List<List<Integer>> li, int index, int[] nums, List<Integer> current){
        li.add(new ArrayList(current));
        System.out.println(li);
        for(int i=index; i<nums.length;i++){
			System.out.println("i= "+i);
			
             if(i>index && nums[i]==nums[i-1]){
				 System.out.println("nums[i]= "+nums[i]+", nums[i-1]= "+nums[i-1]);
				 continue;
			 }
			 System.out.println("After continue , i = "+i);
            current.add(nums[i]);
			System.out.println("current after add = "+current);
           
            dfs(li, i+1, nums, current);
            current.remove(current.size()-1);
        }
        
    }
	public static void main(String[] args){
		int[] arr  = {1,2,2};
		System.out.println(subsetsWithDup(arr));
	}
}