import java.util.*;
public class HashSetEx {
	public static void main(String args[]) {
		HashSet<String> set =new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ajay");
		set.add("Raj");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}