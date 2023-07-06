abstract class Bike{
	Bike(){
		System.out.println("Bike is Created...!!!");
	}
	abstract void run();
	void changeGear(){
		System.out.println("Gear Changed...!!!");
	}
}
class Honda4 extends Bike{
	void run(){
		System.out.println("Running Safely...!!!");
	}
}
class TestAbstraction{
	public static void main(String args[]){
		Bike obj = new Honda4();
		obj.run();
		obj.changeGear();
	}
}