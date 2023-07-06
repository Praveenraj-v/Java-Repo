class CopyWithoutConstructor{
	int id;
	String name;
	CopyWithoutConstructor(int i, String n){
		id=i;
		name=n;
	}
	CopyWithoutConstructor(){}
	void display(){
		System.out.println(id+" "+name);
	}
	public static void main(String args[]){
		CopyWithoutConstructor s1 = new CopyWithoutConstructor(101,"Barath");
		CopyWithoutConstructor s2 = new CopyWithoutConstructor();
		s2.id = s1.id;
		s2.name = s1.name;
		s1.display();
		s2.display();
	}
}