class TestOverloading2{
public static void main(String args[]){
	System.out.println("Main With String []");
	main();
	main("");
	}
public static void main(String args){
	System.out.println("Main with String");
	}
public static void main(){
	System.out.println("Main Without Args");
	}
}