// member function in inheritance
//function overriding 5th way
//changing in type(static or instance)
//-----------------------------------------------
//	parent 		child
//-----------------------------------------------
//  static      non static  not correct
//  non static  static	    not correct
//  static		static      correct
//  instance    instance    correct
//-----------------------------------------------
// this is function hiding



class Base5{
static void show(){
System.out.println("Base class");
}
}

class Child5 extends Base5{
static void show(){
System.out.println("child class");
}

public static void main(String[] args){
Child5 c5=new Child5();
c5.show();
}}
