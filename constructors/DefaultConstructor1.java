// DefaultConstructor or non parameterised constructor +1

class DefaultConstructor1{

int x=getx();

int getx(){
System.out.println(x);
return 10;
}

DefaultConstructor1(){
x=0;
x=getx();
System.out.println(x);
}

void main(){
DefaultConstructor1 dc1=new DefaultConstructor1();
}
}

