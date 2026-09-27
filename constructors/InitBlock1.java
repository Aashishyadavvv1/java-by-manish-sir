// init block with constructor chaining

class InitBlock1{

int x;

{    //init block 1
System.out.println("init block 1");
this.x=10;
}

InitBlock1(int x,int y){    //constructor
System.out.println("double parameter constructor");
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

{    //init block 2
System.out.println("second init block");
}

InitBlock1(int x){
this(100,200);    //constructor
System.out.println("value of x in single parameter constructor is "+x);
}

InitBlock1(){    //constructor
this(10);
System.out.println("default constructor");
System.out.println("value of x is "+x);
}


public static void main(){
new InitBlock1();
}
}