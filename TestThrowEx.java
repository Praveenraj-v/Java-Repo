class TestThrowEx{
	public static void validate(int age){
		if(age<18){
			throw new ArithmeticException("Thambi nee inu valaranum...");
		}
		else{
			System.out.println("Vaa mapla vandhu oru vote ah Kuththu...");
		}
	}
	public static void main(String args[]){
		validate(15);
		System.out.println("Rest of the code...");
	}
}