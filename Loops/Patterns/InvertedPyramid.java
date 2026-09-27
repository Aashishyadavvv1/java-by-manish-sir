//*****
//****
//***
//**
//*

class InvertedPyramid{
void  main(){
int i,j,rows;

System.out.println("enter the number of rows");
rows=new java.util.Scanner(System.in).nextInt();

for(i=rows;i>=1;--i){
	for(j=1;j<=i;++j){
	System.out.printf("* ");
	}
	System.out.printf("\n");
	}
	}
	}