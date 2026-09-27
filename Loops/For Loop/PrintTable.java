class PrintTable{

void main(){

int number; 

System.out.println("enter the number");
number=new java.util.Scanner(System.in) .nextInt();

for(int i=1;i<=10;i++){
System.out.printf("%d * %d = %d\n",number ,i,number*i);
}
}
}