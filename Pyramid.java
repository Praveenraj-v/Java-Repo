import java.util.Scanner;

class Pyramid{
public static void main(String args[]){

System.out.println("Enter the size of Pyramid you need: ");
Scanner obj1=new Scanner(System.in);
int size=obj1.nextInt();
int i, j;   

for(i=0; i<size; i++)   
{   

for(j=0; j<=i; j++)   
{   

System.out.print(" * ");   
}   

System.out.println();   
}   
}   
}