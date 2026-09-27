class Factorial{
void main(){
int i,n;
int fact=1;
System.out.println("enter the integer");
n=new java.util.Scanner(System.in).nextInt();

if(n<=0){
System.out.println("Error");
}
else{
for(i=1;i<=n;++i){
fact=fact*i;
}
System.out.printf("factorial of %d = %d",n,fact);

}
}
}