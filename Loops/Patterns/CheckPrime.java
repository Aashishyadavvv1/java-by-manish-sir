//prime number or not

class CheckPrime{
void main(){

System.out.println("enter number to check");
int number=new java.util.Scanner(System.in).nextInt();

int count  =0;

for(int i=1;i<=number;i++){
int z=number%i;
if(z==0){
count++;
}
}

if(count==2){
System.out.println("its a prime number");
}
else{
System.out.println("its not a prime number");
}
}
}