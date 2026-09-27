// member function in inheritance
//function overriding 4th way
//changing in access modifier
//-----------------------------------------------
//	parent 		child
//-----------------------------------------------
//  weaker 		stronger  correct
//  stronger	weaker	  not correct
//-----------------------------------------------
//  private - default - protected   - public
//  weak    - strong  - more strong - strongest
/*
class Base4{
public void show(){
System.out.println("Base class");
}
}

class Child4 extends Base4{
private void show(){
System.out.println("child class");
}

public static void main(String[] args){
Child4 c4=new Child4();
c4.show();
}}
*/

/*
class Base4{
private void show(){
System.out.println("Base class");
}
}

class Child4 extends Base4{
public void show(){
System.out.println("child class");
}

public static void main(String[] args){
Child4 c4=new Child4();
c4.show();
}
}
*/