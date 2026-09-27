// interface with register class 

interface InterfaceMy1{

default void show(){
System.out.println("interfaceMy1");
}
}

interface InterfaceMy2{

default void show(){
System.out.println("interfaceMy2");
}
}

class MyRegister1{

void register(InterfaceMy1 b){
b.show();
}
}

class Child2 implements InterfaceMy1,InterfaceMy2{

public void show(){
System.out.println("child");
}

void main(){
Child2 c2=new Child2();
MyRegister1 mr1=new MyRegister1();
mr1.register(c2);
InterfaceMy1 if1=new Child2();
if1.show();
InterfaceMy2 if2=new Child2();
if2.show();

}
}