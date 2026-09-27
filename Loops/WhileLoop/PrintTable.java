//printing table with while loop

class PrintTable{
void main(){

System.out.println("enter number");
int number =new java.util.Scanner(System.in).nextInt();

int i=1;
while(i<=10){
System.out.printf("%d * %d = %d\n",number,i,number*i);
i++;
}
}
}