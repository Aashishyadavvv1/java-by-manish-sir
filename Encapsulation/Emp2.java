//static data member 

class Emp2{

String name;
int salary;
static String cname="tcs";

void get(String s1,int s2){
name=s1;
salary=s2;
}

void show(){
System.out.println("name="+name);
System.out.println("salary="+salary);
System.out.println("company name="+cname);
}

void main(){
Emp2 e1=new Emp2();
e1.get("ritik",15000);
e1.show();
Emp2 e2=new Emp2();
e2.get("aashish",15000);
e2.show();
System.out.println("company name via main="+Emp2.cname);
}}