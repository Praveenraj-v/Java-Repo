import java.util.*;
class VectorEx{
	public static void main(String args[]){
		Stack<String> list = new Stack<String>();
		list.add("Sarni");
		list.add("Nivethitha");
		list.add("");
		list.add("Sarni");
		list.add("Praveen");
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(3));
		System.out.println(list.set(3,"Sudhi"));
		System.out.println(list);
		System.out.println(list.contains("Sarni"));
		System.out.println(list.isEmpty());
		list.removeAll(list);
		System.out.println("All Elements Removed");
		System.out.println(list.isEmpty());
		System.out.println(list);
	Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
	}
    
     }
}