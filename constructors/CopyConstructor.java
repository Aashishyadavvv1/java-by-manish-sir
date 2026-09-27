//  Copy Constructor

class CopyConstructor{

int x;
int y;

CopyConstructor(int x,int y){
this.x=x;
this.y=y;
}

void show(){
System.out.println("value of x is "+x);
System.out.println("value of y is "+y);
}

CopyConstructor(CopyConstructor z){
this.x=z.x;
this.y=z.y;
}

public static void main(){
CopyConstructor cc1=new CopyConstructor(20,30);
cc1.show();

CopyConstructor cc2=new CopyConstructor(cc1);
cc2.show();
}
}

