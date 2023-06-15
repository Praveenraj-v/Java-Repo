import java.util.Scanner;

class FactorialEx{  
 public static void main(String args[]){  
  System.out.println("Enter the value to know the Factorial: ");
  Scanner obj1=new Scanner(System.in);
  int num=obj1.nextInt();
  int i,fact=1;      
  for(i=1;i<=num;i++){    
      fact*=i;    
  }    
  System.out.println("The Factorial is :" +fact);    
 }  
}