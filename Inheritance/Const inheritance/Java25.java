//super() using inheritance constructor
//after java 25

class A{

A(){
System.out.println("class A default constructor");
}

}

class B extends A{

B(){
System.out.println("class B default constructor");
}

B(int x){
System.out.println("value of x in B class para constructor "+x);
}

}

class C extends B{

{
System.out.println("init block of C");
}

C(){
//this(10);
System.out.println("class C default constructor");
super(10);
}

C(int x){
System.out.println("value of x in C class para constructor "+x);
}

public static void main(){
//new C();
new C(12);
}
}

