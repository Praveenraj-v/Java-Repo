class Bike{
	void rev(){
		System.out.println("Revving...");
	}
}
class Yamaha extends Bike{
	void stability(){
		System.out.println("Stability...");
	}
}
class Ducati extends Bike{
	void speed(){
		System.out.println("Speeding...");
	}
}
class Hierarchical{
	public static void main(String args[]){
		Ducati d = new Ducati();
		d.speed();
		d.rev();
		//d.stability();//it show compile time error
	}
}