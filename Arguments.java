import java.util.*;

class Arguments{
	
	
	
	
	public static void main(String[] args){
		
		String[] str = { "break", "case", "continue" , "default", "else", "for", "func", "goto", "if", "map", "range", "return ", "struct", "type","var"};
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int flag =0;
		
		for(int i =0; i<str.length;i++){
			//System.out.println(s);
			//System.out.println("str = "+str[i]);
			
			if(str[i].equals(s)){
				
				System.out.println(s + " is a keyword");
				flag = 1;
				break;
				
				
			}
			
		}
		if(flag != 1)
			System.out.println(s + " is not a keyword");
		
		
	}
}
		