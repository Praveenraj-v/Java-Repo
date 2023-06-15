import java.util.Scanner;

class SwitchEx{
public static void main(String args[]){

System.out.println("Enter The Movie Name: ");
Scanner obj1= new Scanner(System.in);
String movie= obj1.nextLine();

System.out.println("Give the Rating : ");
Scanner obj2= new Scanner(System.in);
int rating=obj2.nextInt();

switch(rating){
	case 1:
	System.out.println("Oops! The movie got fucked up..!!!");
	break;
	case 2:
	System.out.println("Story is good movie is bad...!!!");
	break;
	case 3:
	System.out.println("One time watchable movie...!!!");
	break;
	case 4:
	System.out.println("Worth for spending time...!!!");
	break;
	case 5:
	System.out.println("Block buster one..!!!");
	break;

	default:
	System.out.println("Show some humanity in Rating...!!!");
}
}
}