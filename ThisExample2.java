class ThisExample2{
	void m1(){}
	void m2(){
           m1();{
		System.out.println("Say Hellowww...!!!");
		}
	}
	public static void main(String args[]){
		ThisExample2 obj = new ThisExample2();
		obj.m2();
	}
}  