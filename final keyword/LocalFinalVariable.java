// LocalFinalVariable

class LocalFinalVariable{

void main(){

final int x=10;
x=x+20; // error because of final 
System.out.println(x);
final LocalFinalVariable t1=new LocalFinalVariable();
	t1=new LocalFinalVariable(); error because of final
}
}