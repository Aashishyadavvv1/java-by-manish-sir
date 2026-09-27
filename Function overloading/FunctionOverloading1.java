// funtion overloading with change in adata type of argumnents

class FunctionOverloading1{

int x=10;

void show(){
System.out.println("value of class x is "+x);
System.out.println("-------------");
}

void show(int x){
System.out.println("value of x is "+x);
System.out.println("-------------");
}

void show(float f){
System.out.println("value of x in float is "+f);
System.out.println("-------------");
}

void show(String s){
System.out.println("value of x in string is "+s);
}

public static void main(){
FunctionOverloading1 fo=new FunctionOverloading1();
fo.show();
fo.show(100);
fo.show(20.5f);
fo.show("Aashish");
}
}
