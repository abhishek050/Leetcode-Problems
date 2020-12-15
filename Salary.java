import java.util.*;

class Solution2 {
    public static double average(int[] salary) {
        Arrays.sort(salary);
        int min = 0;
        float max = salary.length-1;
		System.out.println("max= "+max);
        float sum  = 0;
        float average = 0;
        for(int i =0; i<salary.length;i++){
			System.out.println(i);
            if(i == 0 || i==max) continue;
            System.out.println(salary[i]);
            sum += salary[i];
            if(i ==max-1){
				System.out.println("sum = "+sum+", i = "+i);
                average = sum / (max-1);
				System.out.println("avg = "+average);
            }
                
        }
        return average;
        
    }
	public static void main(String[] args){
		int[] arr = {48000,59000,99000,13000,78000,45000,31000,17000,39000,37000,93000,77000,33000,28000,4000,54000,67000,6000,1000,11000};
		System.out.println(average(arr));
	}
}