import java.util.Scanner;

class SumOfDigitsEx{  
 public static void main(String args[]){  
  System.out.println("Enter the value to know the sum of digits: ");
  Scanner obj1=new Scanner(System.in);
  int num=obj1.nextInt();
  int i,sum=0;      
  for(i=1;i<=num;i++){    
      sum+=i;    
  }    
  System.out.println("The Sum Of Digits is :" +sum);    
 }  
}