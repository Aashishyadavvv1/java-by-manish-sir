// DefaultConstructor or non parameterised constructor

class DefaultConstructor{

int x;
int y;

DefaultConstructor(){
x=10;
y=20;
}

void show(){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

void main(){
DefaultConstructor dc=new DefaultConstructor();
dc.show();

DefaultConstructor dc1=new DefaultConstructor();
dc1.show();
}
}