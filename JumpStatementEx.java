class JumpStatementEx{
 public static void main(String args[]){

//Break Statement:
System.out.println("Break Statement:");
 for(int i=1;i<=10;i++){
	if(i==5){
		break;
}
	System.out.println(i);
}

//Continue Statement:
System.out.println("Continue Statement:");
for(int j=1;j<=10;j++){
	if(j==5){
		continue;
}
	System.out.println(j);
}		
}
}