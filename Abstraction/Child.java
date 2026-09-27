//abstraction using register class 

abstract class Base{

int x;
int y;

void show(){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

abstract void display();
}

class MyRegister{

void register(Base b){
b.display();
}
}

class Child extends Base{

void get(int x,int y){
this.x=x;
this.y=y;
}

void display(){
System.out.println("display");
}

void main(){
Child c=new Child();
MyRegister mr=new MyRegister();
mr.register(c);
}
}