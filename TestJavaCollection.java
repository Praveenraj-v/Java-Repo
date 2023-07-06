import java.util.*;
class TestJavaCollection{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		list.add("");
	Iterator itr = list.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
    
     }
}