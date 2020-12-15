// Find the 15th term
//0,0,7,6,14,12,21,18,28
//odd ++7
//even ++6


class NnumberSeries{
	
	public static void findTerm(int n){
		int[] arr = new int[n+2];
		int a = n/2;
		System.out.println("a = "+a);
		for(int i =0; i<=a;i++){
			arr[2*i] =(int) Math.pow(2,i);
			arr[2*i+1] = (int)Math.pow(3,i);
			
		}
		System.out.println(arr[16]);
		
	}
	
	public static void main(String[] args){
		findTerm(16);
	}
}