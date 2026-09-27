// member function in inheritance
//function overriding 6th way
// final fucntions cannot be overidden

class Base6{
static final void show(){
System.out.println("Base class");
}
}

class Child6 extends Base6{
static void show(){
System.out.println("child class");
}

public static void main(String[] args){
Child6 c6=new Child6();
c6.show();
}}
