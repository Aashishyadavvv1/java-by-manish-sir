// static 

interface InterfaceStatic{
static void show(){
System.out.println("show");
}
}
class Child3 implements InterfaceStatic{

void main(){
InterfaceStatic.show();
}
}