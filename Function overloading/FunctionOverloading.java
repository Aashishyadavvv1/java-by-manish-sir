// function overloading with change in number of arguments

class FunctionOverloading{

int x=10;

void show(){
System.out.println("value of class x is "+x);
System.out.println("-------------");
}

void show(int x){
System.out.println("value of x is "+x);
System.out.println("-------------");
}

void show(int x,int y){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
System.out.println("-------------");
}

void show(int x,int y,int z){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
System.out.println("value of z is "+z);
}

public static void main(){
FunctionOverloading fo=new FunctionOverloading();
fo.show();
fo.show(100);
fo.show(1000,2000);
fo.show(10000,20000,30000);
}
}
