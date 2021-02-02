import java.util.*;
public class ThirdMax{
	public static void main(String[] args)
	{
		int[] arr = {7,8,6,3,2};
		System.out.println(findMax(arr));
	}
	
	public static int findMax(int[] nums)
	{
		Integer max1 = null;
        Integer max2 = null;
        Integer max3 = null;
        for (Integer n : nums) {
            if (n.equals(max1) || n.equals(max2) || n.equals(max3)) continue;
            if (max1 == null || n > max1) {
				System.out.println(" 1 if loop ");
                max3 = max2;
                max2 = max1;
                max1 = n;	
            } else if (max2 == null || n > max2) {
                max3 = max2;
                max2 = n;
            } else if (max3 == null || n > max3) {
                max3 = n;
            }
        }
        return max3 == null ? max1 : max3;
	}
}
		