//infinite Loop using while loop

class InfiniteLoop{
void main(){

double number,sum=0.0;



while(true){
System.out.println("enter number");
number=new java.util.Scanner(System.in).nextInt();
if(number < 0.0){
break;
}
sum +=number;
}
System.out.println("total sum is "+sum);
}
}