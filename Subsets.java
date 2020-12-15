
import java.util.*;

class Subsets2{
	 public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> li = new ArrayList<List<Integer>>();
        
        dfs(li, 0, nums, new ArrayList());
        return li;
        
        
    }
    public static void dfs(List<List<Integer>> li, int index, int[] nums, List<Integer> current){
        li.add(new ArrayList(current));
        
        for(int i=index; i<nums.length;i++){
            current.add(nums[i]);
            dfs(li, i+1, nums, current);
            current.remove(current.size()-1);
        }
        
    }
	
	public static void main(String[] args){
		int[] arr = {1,2,2};
		System.out.println(subsetsWithDup(arr));
	}
}

