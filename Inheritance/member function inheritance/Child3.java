// member function in inheritance
//function overriding 3rd way
// returing reference of class
//changing return type with pre defined classes


class Base3{
Base3 show(){
System.out.println("Base class");
return new Base3();
}
}

class Child3 extends Base3{
Child3 show(){
System.out.println("child class");
return new Child3();
}

public static void main(String[] args){
Child3 c3=new Child3();
c3.show();
}}

