// prime number or not

class PrimeOrNot{
void main(){
System.out.println("enter number ");
int number=new java.util.Scanner(System.in).nextInt();
int count=0;

for(int i=2;i<number-1;i++){
	if(number%i==0){
	count++;
	break;
}
}

if(count==1){
System.out.println("not a prime number");
}
else{
System.out.println("prime number");
}
}
}