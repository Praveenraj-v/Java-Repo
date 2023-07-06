class Bank{
	float getInterest(){
		return 0.0f;
	}
}
class SBI extends Bank{
	float getInterest(){
		return 8.4f;
	}
}
class ICICI extends Bank{
	float getInterest(){
		return 7.3f;
	}
}
class AXIS extends Bank{
	float getInterest(){
		return 9.7f;
	}
}
class TestPolymorphism{
public static void main(String args[]){
	Bank b;
	b = new SBI();
	System.out.println("SBI Rate Of Interest: "+ b.getInterest());
	b = new ICICI();
	System.out.println("ICICI Rate Of Interest: "+ b.getInterest());
	b = new AXIS();
	System.out.println("AXIS Rate Of Interest: "+ b.getInterest());
	}
}