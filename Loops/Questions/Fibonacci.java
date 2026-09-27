// fibonacci series

class Fibonacci{
void main(){
System.out.println("enter number ");
int number =new java.util.Scanner(System.in).nextInt();

int a=0,b=1,c=0;
while (a<=number){
	c=a+b;
	a=b;
	b=c;
}
System.out.println("answer of fibonacci is "+a);
}
}