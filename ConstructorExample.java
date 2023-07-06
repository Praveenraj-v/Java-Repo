class ConstructorExample{
	int id;
	String name;
	int age;
	ConstructorExample(int i,String n){
		id=i;
		name=n;
	}
	ConstructorExample(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}

    	public static void main(String args[]){  
    		ConstructorExample s1 = new ConstructorExample(101,"Barath");  
    		ConstructorExample s2 = new ConstructorExample(105,"Chandru",17);  
    		s1.display();  
    		s2.display();  
   	}    
}