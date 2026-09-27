//absolute value

class Absolutevalue{
public static void main(){

System.out.println("Enter number");
int number=new java.util.Scanner(System.in) .nextInt();

if(number>0){
System.out.println("absolute value is "+ number);
}
else{
System.out.println("absolute value is "+(-(number)));
}
}
}