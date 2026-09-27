// Constructor Chaining

class ConstructorChaining{

ConstructorChaining(){
this(10);
System.out.println("default");
}

ConstructorChaining(int x,int y,int z){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
System.out.println("value of z is "+z);

}

ConstructorChaining(int x,int y){
this(10000,20000,30000);
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

ConstructorChaining(int x){
this(1000,2000);
System.out.println("value of x is "+x);

}

public static void main(){
new ConstructorChaining();
}
}