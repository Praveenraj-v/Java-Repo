class WrapperEx3{
	public static void main(String args[]){
		byte b = 10;
		short s = 20;
		int i = 30;
		long l = 40;
		float f = 50.0f;
		double d = 60.0d;
		char c = 'a';
		boolean b2 = true;
//___________________________________________________________
		Byte byteobj=b;
		Short shortobj = s;
		Integer intobj = i;
		Long longobj = l;
		Float floatobj = f;
		Double doubleobj = d;
		Character charobj = c;
		Boolean booleanobj = b2;
//____________________________________________________________
	System.out.println("---Print Objects Values---");
		System.out.println("The Output is : "+b+" , "+s+" , "+i+" , "+l+" , "+f+" , "+d+" , "+c+" , "+b2);
	}
}