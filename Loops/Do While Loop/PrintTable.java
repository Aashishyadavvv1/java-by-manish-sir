// printing table with do while loop

class PrintTable{
void main(){

System.out.println("enter the number");
int number=new java.util.Scanner(System.in).nextInt();

int i=1;

do{
System.out.printf("%d *%d =%d\n",number,i,number*i);
i++;
}
while(i<=10);
}
}
