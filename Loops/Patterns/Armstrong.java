class Armstrong{

void main(){
int rev=0;
int z;
int x2;
while (true){
System.out.println("enter the value");
x2=new java.util.Scanner(System.in).nextInt();
int x1=x2;
while(x1>0){
z=x1%10;
x1=x1/10;
rev=rev+(z*z*z);
}
if(rev==x2){
System.out.println("it is a armstrong number");
}
else{
System.out.println("it is not a armstrong number");
}
System.out.println("do you want to continue press 1 for yes 0 for no");
int x3=new java.util.Scanner(System.in).nextInt();
if(x3==1){
continue;
}
else{
break;
}
}
}
}