//interface with default keyword

interface Interface1{

default void shoow(){
System.out.println("default");
}
}

/* class Child1 implements Interface1{
public static void main(){
Interface1 i=new Child1();
i.shoow();
}
}*/

class Child1 implements Interface1{
public void shoow(){
	System.out.println("child");
}

public static void main(){
Interface1 i=new Child1();
i.shoow();
}
}