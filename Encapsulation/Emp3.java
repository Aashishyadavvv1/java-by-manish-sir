//static data member and static member function

class Emp3{

String name;
int salary;
static String cname="tcs";

void get(String s1,int s2){
name=s1;
salary=s2;
}

static void addition(int a,int b){
int result=a+b;
System.out.println("result of addition is="+ result);
}

void show(){
System.out.println("name="+name);
System.out.println("salary="+salary);
System.out.println("company name="+cname);
}

void main(){
Emp3 e1=new Emp3();
e1.get("ritik",15000);
e1.show();
Emp3 e2=new Emp3();
e2.get("aashish",15000);
e2.show();
System.out.println("company name via main="+Emp3.cname);
Emp3.addition(5,10);
}}