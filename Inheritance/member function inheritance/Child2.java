// member function in inheritance
//function overriding 2nd way
// returing reference of class
//changing return type with new classes


class Base2{
A show(){
System.out.println("Base class");
return new A();
}
}

class A{

}

class B extends A{

}

class Child2 extends Base2{
B show(){
System.out.println("child class");
return new B();
}

public static void main(String[] args){
Child2 c2=new Child2();
c2.show();
}}

