//*****
//22222
//*****
//44444
//*****
//66666

class Pattern9HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i){
	for(int j=1; j<=rows ; ++j){
	if(i%2==0){
	System.out.print(i);
	}
	else{
	System.out.print("*");
	}
	}
	System.out.println();
}
}
}