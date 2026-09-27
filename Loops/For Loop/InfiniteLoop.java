class InfiniteLoop{

void main(){

double number,sum=0.0;

for(; ;){

System.out.println("enter the number");
number= new java.util.Scanner(System.in) .nextInt();

if(number < 0.0){
break;
}
sum +=number; //sum =sum+number
}
System.out.println("the sum od number is "+sum);
}
}