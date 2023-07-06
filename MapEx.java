import java.util.*;
class MapEx{
	public static void main(String args[]){
		Map<Integer,String>map = new HashMap<Integer,String>();
		map.put(101,"Praveen");
		map.put(102,"Sarni");
		map.put(103,"Raj");
		map.put(104,"Sudhi");
		map.put(105,"Praveen");
		map.put(106,"");
		map.remove(106);
map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		/*for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}*/
	}
}