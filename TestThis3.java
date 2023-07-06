class ThisExample2{
	int rollno;
	String name,course;
	float fee;

	ThisExample2(int rollno,String name, String course){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
	}

	ThisExample2(int rollno, String name, String course, float fee){
		this(rollno, name, course);
		this.fee = fee;
	}

	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
	}
}
class TestThis3{
	public static void main(String args[]){
		ThisExample2 obj1 = new ThisExample2(111,"Mouni","Java");
		ThisExample2 obj2 = new ThisExample2(122, "Praveen.K.S","Java",1000f);
		obj1.display();
		obj2.display();
	}
}