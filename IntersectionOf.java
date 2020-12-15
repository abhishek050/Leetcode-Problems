import java.util.*;
class Solution {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        int i =0;
        int j=0;
        List<Integer> li = new ArrayList<>();
        
        while(i<nums1.length && j<nums2.length){
			System.out.println("nums1["+i+"] = "+nums1[i] + ", and nums2["+j+"] = "+nums2[j]);
            if(nums1[i] == nums2[j]){
				System.out.println(" IN IF LOOP   :-nums1["+i+"] = "+nums1[i] + ", and nums2["+j+"] = "+nums2[j]);
                if(li.size()>0){
					System.out.println("I am in second if loop");
                    if(li.contains(nums1[i])){
						System.out.println("I am in third loop");
                        continue;
					}
				}

				System.out.println("I am in second else loop");
				int h = nums1[i];
				System.out.println("h = "+nums1[i]);
                li.add(h);
				System.out.println(li);
                i++;
                j++;
                                
            }
			if(nums1[i]<nums2[j] ){
                    i++;
                    
                }
            else{
                j++;
			}
        }
		System.out.println("after while loop li = "+li);
        int[] arr = new int[li.size()];
        int index = 0;
        for(int k =0;i<li.size();i++){
			
			arr[index] = i;
			index++;
			System.out.println("arr "+arr[index]);
		}
        return arr;
        
        
    }
	public static void main(String[] args){
		int[]  array1 = {4,9,5};
		int[] array2 = {9,4,9,8,4};
		System.out.println(intersection(array1,array2));
	}
	
}


