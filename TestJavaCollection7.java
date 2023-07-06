import java.util.*;
class TestJavaCollection7{
	public static void main(String args[]){
		TreeSet<String> list = new TreeSet<String>();
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