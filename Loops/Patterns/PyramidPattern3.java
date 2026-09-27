//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5


class PyramidPattern3{
void main() throws java.io.IOException{

int i,j,rows;
System.out.println("enter the number of rows");
rows=new java.util.Scanner(System.in).nextInt();

for(i=1;i<=rows;++i){
	for(j=1;j<=i;++j){
	System.out.printf("%d ",j);
	}
	System.out.printf("\n");
}
}
}