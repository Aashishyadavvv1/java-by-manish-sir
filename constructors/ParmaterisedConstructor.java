// parmaterised constructor

class ParmaterisedConstructor{

int x;
int y;

ParmaterisedConstructor(int x,int y){
this.x=x;
this.y=y;
}

void show(){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

public static void main(){
ParmaterisedConstructor pc1=new ParmaterisedConstructor(10,50);
pc1.show();
}
}