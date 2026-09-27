//*
//**
//***
//****
//*****

class PyramidPattern2{
void main() throws java.io.IOException{

int i,j,rows;
System.out.println("enter the number of rows");
rows=new java.util.Scanner(System.in).nextInt();

for(i=1;i<=rows;++i){
	for(j=1;j<=i;++j){
	System.out.printf("* ");
	}
	System.out.printf("\n");
}

}
}	