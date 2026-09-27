class AlphaPyramid{

void main(){
char alphabet='A';
System.out.println("enter the uppercase alphabet you wannt in last row");
char input=new java.util.Scanner(System.in).next().charAt(0); 

for(int i=1;i<=(input-'A'+1);++i){
	for(int j=1;j<=i;++j){
		System.out.print(alphabet+" ");
	}
	++alphabet;
	System.out.println();
	}
}
}