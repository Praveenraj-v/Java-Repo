class TestFinallyBlock{
	public static void main(String args[]){
		try{
		int data = 25/0;
		System.out.println(data);
		}
		catch(NullPointerException e){
			e.printStackTrace();
		}
		finally{
		System.out.println("Finally block is always  Executed");
		}
	System.out.println("Rest of Code...");
	}
}