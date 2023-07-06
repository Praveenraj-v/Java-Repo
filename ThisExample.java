class ThisExample{
	int rollno;
	String name;
	float fee;
	ThisExample(int rollno,String name,float fee){
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display(){
		System.out.println(rollno+" "+name+" "+fee);
	}
	public static void main(String args[]){
		ThisExample obj = new ThisExample(101,"Stephen",50000f);
		obj.display();
	}
}