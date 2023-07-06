import java.util.*;
public class DequeueEx{
	public static void main(String args[]){
		Deque<String> deque=new ArrayDeque<String>();
		deque.add("Gautham");
		deque.add("Karan");
		System.out.println(deque);
		for(String str:deque){
			System.out.println(str);
		}
	}
}