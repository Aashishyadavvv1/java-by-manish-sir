//*****
//*****
//*****
//*****
//*****

class Pattern1HW{
void main(){

System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i){
	for(int j=1; j<=rows; ++j){
	System.out.print("*");
	}
	System.out.println();
}
}
}