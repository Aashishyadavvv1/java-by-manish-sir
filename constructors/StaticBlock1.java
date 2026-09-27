// static block 

class StaticBlock{

static int x;

static{
System.out.println("static block ");
System.out.println("enter x");
x=new java.util.Scanner(System.in).nextInt();
}
}


class StaticBlock1{
public static void main(){
System.out.println("static block from Static block 1 class");
System.out.println(StaticBlock.x);
System.out.println("after static block from static block 1 class");
}
}

class StaticBlock2{
public static void main(){
System.out.println("static block from static block 2 class");
System.out.println(StaticBlock.x);
System.out.println("after static block from static block 2 class ");
}
}