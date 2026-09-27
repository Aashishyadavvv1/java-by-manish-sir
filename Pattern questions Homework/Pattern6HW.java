//11111
//00000
//11111
//00000
//11111

class Pattern6HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i){
	for(int j=1; j<=rows ; ++j){
	if(i%2==0){
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