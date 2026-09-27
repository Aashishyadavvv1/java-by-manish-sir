//12345
//23456
//34567
//45678
//56789

class Pattern7HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();
int count=1;
for(int i=1; i<=rows; ++i,count=i){
	for(int j=1; j<=rows; ++j, ++count){
	System.out.print(count);
	}
	System.out.println();
}
}
}
	