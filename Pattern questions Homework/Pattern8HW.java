//ABCDE
//ABCDE
//ABCDE
//ABCDE
//ABCDE

class Pattern8HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();
char alphabet='A';
for(int i=1; i<=rows; ++i,alphabet='A'){
	for(int j=1; j<=rows; ++j,++alphabet){
	System.out.print(alphabet);
	}
	System.out.println();
	}
	}
	}