class PyramidPattern4{
void main(){

int i,rows,space=0,count=0,count1=0,k=0;

System.out.println("enter number if rows");
rows=new java.util.Scanner(System.in).nextInt();

for(i=1;i<=rows;++i){
	for(space=1;space<=rows-i;++space){
	System.out.printf(" ");
	++count;
	}
	
	while(k != 2 * i -1){
		if(count <=rows - 1){
		System.out.printf("%d  ",i+k);
		++count;
		}
		else{
		++count;
		System.out.printf("%d  ",(i + k - 2 * count1));
		}
		++k;
	}
	count1=count=k=0;
	System.out.printf("\n");
}
}
}
	
	
	
	