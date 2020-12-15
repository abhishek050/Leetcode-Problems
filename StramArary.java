import java.util.*;

class StramArray{
	public static void main(String[] args){
		int Arr[][] = {{10,20,15,22,35}};
		
		System.out.println("Integer Array: "+ Arrays.toString(Arr));
		System.out.println("Integer Array2: "+ Arrays.deepHashCode(Arr));
		//System.out.println("Integer Array2: "+ Arrays.deepToString(Arr));
	}
}