//54321
//65432
//76543
//87654
//98765

class Pattern13HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

System.out.println("enter count to start");
int count=new java.util.Scanner(System.in).nextInt();

for(int i=1 ;i<=rows; ++i){
	for(int j=rows; j>=1; --j,++count){
	System.out.print(count);
	}
	System.out.println();
}
}
}