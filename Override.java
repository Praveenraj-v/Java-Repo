interface Method{
	public void myMethod();
}
class Override implements Method{
	public void myMethod(){
		System.out.println("The Method is Over rided");
	}
	public static void main(String args[]){
		Method obj;
		obj = new Override();
		obj.myMethod();
	}
}