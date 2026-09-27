//init block inheritance constructor

class A{

{
System.out.println("init block of A");
}

A(){
System.out.println("default constructor of A ");
}

}

class B extends A{

{
System.out.println("init block of B");
}

B(){
System.out.println("default constructor of B");
}

B(int x){
System.out.println("value of x in para constructor of B "+x);
}

}

class C extends B{

{
System.out.println("init block of C");
}

C(){
super(10);
System.out.println("default constructor of C");
}

C(int x){
System.out.println("value of x in para constructor of C "+x);
}

public static void main(){
//new C();
new C(12);
}
}