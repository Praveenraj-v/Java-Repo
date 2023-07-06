import java.util.*;
class NavigableMapEx{
	public static void main(String args[]){
		NavigableMap<Integer,String>map = new TreeMap<Integer,String>();
		map.put("101","Praveen");
		map.put("102","Sarni");
		map.put("103","Raj");
		map.put("104","Sudhi");
		map.put("105","Praveen");
		map.put("106","");
		map.put("","");
		map.put("","Shri");

	System.out.println(map.descendingMap());
	System.out.println(map.headMap("102", true));
	System.out.println(map.tailMap("102", true));
	System.out.println(map.subMap("102", true, "105", true));
map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		/*for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
	}
}