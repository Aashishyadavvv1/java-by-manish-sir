//10101
//10101
//10101
//10101
//10101

class Pattern5HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i){
	for(int j=1; j<=rows ; ++j){
	if(j%2==0){
	System.out.print("0");
	}
	else{
	System.out.print("1");
	}
	}
	System.out.println();
}
}
}
	