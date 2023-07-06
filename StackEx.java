import java.util.*;
class StackEx{
	public static void main(String args[]){
		Stack<String> list = new Stack<String>();
		list.push("Sarni");
		list.push("Nivethitha");
		list.push("Praveen");
		list.push("Sarni");
		list.push("Sudhi");
		System.out.println(list);
		list.pop();
		System.out.println(list);

	Iterator itr = list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
	}
    
     }
}