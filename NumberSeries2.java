import java.lang.*;
class NumberSeries{
	
	public static void findTerm(int n){
		int a = n/2;
		int[]  arr= new int[n+1];
		for(int i = 0;i<=a;i++){
			arr[2*i] =(int) Math.pow(2,i);
			arr[2*i+1] = (int)Math.pow(3,i);
		}
		System.out.println(arr[16]);
			
			
			
		
		
		
	}
	
	public static void main(String[] args){
		findTerm(16);
	}
}