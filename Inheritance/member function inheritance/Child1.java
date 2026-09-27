// member function in inheritance
//function overriding 1st way

class Base1{
void show(){
System.out.println("Base class");
}
}

class Child1 extends Base1{
void show(){
System.out.println("child class");
}

public static void main(String[] args){
Child1 c1=new Child1();
c1.show();
}
}
