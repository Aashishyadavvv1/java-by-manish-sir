class InstanceFinalVariable{

final int x=20;

void main(){

InstanceFinalVariable t=new InstanceFinalVariable();
 //t.x=t.x+50; //this will give error bcoz of final
 System.out.println(t.x);
 
 InstanceFinalVariable t1=new InstanceFinalVariable();
// t1.x=t1.x+50; //this will give error bcoz of final
 System.out.println(t1.x);
 }
 }
 