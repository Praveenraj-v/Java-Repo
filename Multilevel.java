class Animal{
	void eat(){
	System.out.println("Eating...");
	}
}
class Dog extends Animal{
	void bark(){
	System.out.println("Barking...");
	}
}
class BabyDog extends Dog{
	void weeb(){
	System.out.println("Weebing...");
	}
}
class Multilevel{
	public static void main(String args[]){
		BabyDog bd = new BabyDog();
		bd.weeb();
		bd.bark();
		bd.eat();
	}
}