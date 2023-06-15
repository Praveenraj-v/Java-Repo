import java.util.Scanner;

public class ElseIfEx{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter Your Mark: ");

int mark = sc.nextInt();

if(mark>90){
	System.out.println("A+ grade");
}else if(mark>75 && mark<90){
	System.out.println("A grade");
}else if(mark>35 && mark<75){
	System.out.println("B grade");
}else{
	System.out.println("Adhu Mudinchu marupadiyum Padi...!!!");
}
}
}