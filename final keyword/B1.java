class B1{

final int x;

B1(int z){
// x=0; //inserted by compiler
//System.out.println(x);
x=z;
System.out.println(x);
}

void main(){
B1 b1=new B1(20);
//b1.x=600;
B1 b2=new B1(1000);
}
}