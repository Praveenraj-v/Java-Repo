class CloneExample implements Cloneable{
	int rollno;
	String name;

	CloneExample(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}

	public Object Clone()throws CloneNotSupportedException{
		return super.clone();
	}

	public static void main(String args[]){
		try{
			CloneExample s1 = new CloneExample(11,"Jayasarangan");
			CloneExample s2 = (CloneExample)s1.clone();
			System.out.println(s1.rollno+" "+s1.name);
			System.out.println(s2.rollno+" "+s2.name);
		}catch(CloneNotSupportedException c){}
	}
}