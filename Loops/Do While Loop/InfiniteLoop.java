//Infinite Loop using Do while loop

class InfiniteLoop{

void main(){

double number,sum=0.0;

do{
System.out.println("enter number");
number=new java.util.Scanner(System.in).nextInt();
sum +=number;
}
while(number>0.0);

System.out.println("the sum of number is "+sum);

}

}

