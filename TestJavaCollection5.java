import java.util.*;
class TestJavaCollection5{
	public static void main(String args[]){
		HashSet<String> list = new HashSet<String>();
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