// init block without constructor chaining

class InitBlock{

int x;

{    //init block 1
System.out.println("init block 1");
this.x=10;
}

InitBlock(){    //constructor
System.out.println("default constructor");
System.out.println("value of x is "+x);
}

{    //init block 2
System.out.println("second init block");
}

InitBlock(int x){    //constructor
System.out.println("value of x in constructor is "+x);
}

public static void main(){
new InitBlock();
new InitBlock(10);
}
}