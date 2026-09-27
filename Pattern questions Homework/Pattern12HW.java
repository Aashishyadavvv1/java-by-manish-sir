//55555
//44444
//33333
//22222
//11111

class Pattern12HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

System.out.println("enter count to start");
int count=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i,--count){
	for(int j=1; j<=rows; ++j){
	System.out.print(count);
	}
	System.out.println();
	}

}
}