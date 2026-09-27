//inverted Pyramid
/*
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*
*/

class InvertedPyramid{
void main(){

System.out.println("enter number of rows");
int rows=new java.util.Scanner(System.in).nextInt();

for(int i=rows ; i>=1 ; --i){
	for(int j=1 ; j<=i ; ++j){
	System.out.print("* ");
	}
	System.out.println();
	}
	}
	}