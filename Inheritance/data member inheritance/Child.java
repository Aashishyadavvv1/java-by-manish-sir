// Inheritance
// data member inheritance
//data hiding

class Dadaji{
	int x=80;
}

class Base extends Dadaji{
int x=50;
}

class Child extends Base{
int x=20;

void show(){
System.out.println("value of x is "+x);
System.out.println("value of x in Base is "+super.x);
System.out.println("value of x in dadaji "+((Dadaji)this).x);
System.out.println("value of x in base "+((Base)this).x);
}
public static void main(){
Child c=new Child();
c.show();
System.out.println("value of x in dadaji "+((Dadaji)c).x);
}
}
