//10101
//01010
//10101
//01010
//10101

class Pattern14HW{
void main(){
System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1; i<=rows; ++i){
	if(i%2==0){
	
		for(int j=1; j<=rows; ++j){
			if(j%2==0){
			System.out.print("1");
			}
			else{
			System.out.print("0");
			}
		}
	}
	else{
		for(int j=1; j<=rows; ++j){
			if(j%2==0){
			System.out.print("0");
			}	
			else{
			System.out.print("1");
			}
		}	
	}
	System.out.println();
}
}
}