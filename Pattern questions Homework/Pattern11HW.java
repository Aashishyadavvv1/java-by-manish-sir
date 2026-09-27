//54321
//54321
//54321
//54321
//54321

class Pattern11HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1,count=5 ; i<=rows; ++i,count=5){
	for(int j=1; j<=rows; ++j,--count){
	System.out.print(count);
	}
	System.out.println();
	}

}
}