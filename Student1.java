class Student1{
	int rollno;
	String name;
	static String college="Dr.N.G.P";
	
	Student1(int r,String n){
		rollno=r;
		name=n;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+college);
	}
	public static void main(String args[]){
		Student1 obj = new Student1(101,"Kavin");
		obj.display();
	}
}