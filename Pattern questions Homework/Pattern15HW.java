//ABCDE
//BCDEF
//CDEFG
//DEFGH
//EFGHI

class Pattern15HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

char alphabet='A';

for(int i=1; i<=rows; ++i,int alphabet=(int)alphabet){
	for(int j=i; j<=rows; ++j,++alphabet){
	System.out.print(alphabet);
	}
	System.out.println();
	}
}
}