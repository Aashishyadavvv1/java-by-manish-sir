// var can be used only with local varaible and it cannot be used as formal parameter
// and class level variable also

class VarExample{
// var s=10;//this will give error as it is not in local variable and local variable is used only in main method

public static void main(){
System.out.println("enter the number of days");
var days= new java.util.Scanner(System.in).nextInt();
System.out.println("number of days"+days);
System.out.println("enter the name");
var name= new java.util.Scanner(System.in).nextLine();
System.out.println("name"+name);
byte b1=10;
byte b2=20;
var b3=b1+b2;
System.out.println("sum oif bytes is "+b3);
var s1=new VarExample();

System.out.println("s1");
var ch=10;
var z="hello";
var b=true;

System.out.println(ch);
System.out.println(z);
System.out.println(b);
var a=10;
var c=3;
var d=a/c;

System.out.println(d);
}
}