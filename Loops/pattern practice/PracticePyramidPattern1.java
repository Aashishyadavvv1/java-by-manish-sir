//      *
//     ***
//    *****
//   *******
//  *********

class PracticePyramidPattern1{
void main(){

System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=1;i<=rows;++i){
	for(int space=1;space<=(rows-i);++space){
	System.out.print(" ");
	}
	for(int k=0;k!=2*i-1;++k){
	System.out.print("*");
	}
	System.out.println();
}
}
}	
