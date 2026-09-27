class Fibonacci{

void main(){
int n,i;
//initialise first and second term
int t1=0,t2=1;
//innitialise the next term
int nextTerm=t1+t2;

System.out.println("enter the number of terms ");
n=new java.util.Scanner(System.in).nextInt();

System.out.printf("Fibonacci series %d, %d, ",t1,t2);

for(i=3;i<=n;++i){
	System.out.printf("%d, ",nextTerm);
t1=t2;
t2=nextTerm;
nextTerm=t1+t2;
}
}
}