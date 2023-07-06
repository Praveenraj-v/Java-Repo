import java.util.*;
class ArrayListEx{
	public static void main(String args[]){
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Ravi");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(1));
		System.out.println(list.contains("Vijay"));
		System.out.println(list.isEmpty());
		list.removeAll(list);
		System.out.println("All Elements Removed");
		System.out.println(list.isEmpty());
		System.out.println(list);
     }
}