class ContinueExample{

void main(){

double number,sum=0.0;

for (int i=1;i<=10;i++){
System.out.println("enter the number");
number=new java.util.Scanner(System.in).nextInt();

if(number<0.0){
continue;
}
sum +=number;
}

System.out.println("sum of number is "+sum);
}
}