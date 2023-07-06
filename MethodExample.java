class MethodExample{

	public String myMethod(String str){
		System.out.println(str);
		return str;
	}
	public static void main(String args[]){
		MethodExample obj = new MethodExample();
		obj.myMethod("Welcome");
	}
}