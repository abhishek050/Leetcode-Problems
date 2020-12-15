import java.util.*;

class Demo{
	public static void main(String[] args){
		LinkedList<String> al = new LinkedList<String>();
		al.add("Tom");
		al.add("Alice");
		al.add("Tom");
		al.add("Bob");
		
		Iterator<String> itr= al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
		