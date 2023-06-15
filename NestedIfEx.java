import java.util.Scanner;

class NestedIfEx{
public static void main(String args[]){

Scanner obj1 = new Scanner(System.in);
Scanner obj2 = new Scanner(System.in);

System.out.println("Enter Your Country With First Letter Caps: ");
String country = obj1.nextLine();
System.out.println("Enter Your Age: ");
int age = obj2.nextInt();

if(country.equals("India")){
	System.out.println("Your Country Is " + country);
	if (age>=18){
		System.out.println("You are eligible to Vote");

	}else{
		System.out.println("Yo
ur Age is : "+age
);
		System.out.println("This is India, you must be above 18 to vote");
	}
}else{
	System.out.println("You are not from India");
}
}
}