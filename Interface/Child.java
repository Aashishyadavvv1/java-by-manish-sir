// interface

interface My{

void show();
}

interface My1 extends My{

void display();
}

interface My2 extends My1,My{

void xyz();
}

class Child implements My,My1,My2{

public void show(){
System.out.println("show");
}

public void display(){
System.out.println("display");
}

public void xyz(){
System.out.println("xyz");
}

void main(){
My m=new Child();
m.show();
My1 m1=new Child();
m1.show();
m1.display();
My2 m2=new Child();
m2.show();
m2.display();
m2.xyz();
}
}
