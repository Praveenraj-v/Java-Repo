import java.util.*;
class TestJavaCollection6{
	public static void main(String args[]){
		LinkedHashSet<String> list = new LinkedHashSet<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("");
		list.add("Ajay");
		list.add("Ravi");
	Iterator itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
    
     }
}