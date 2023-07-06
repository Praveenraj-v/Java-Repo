class A{
	public void msg(){
		System.out.println("Msg");
	}
}
class B{
	public void show(){
		System.out.println("Show");
	}
}
interface I1 extends A{
	static void msg(){}
}
interface I2 extends B{
	static void Show(){}
}
class C implements I1,I2{
	public static void main(String args[]){
		C obj = new C();
		obj.msg();
		obj.show();
	}
}