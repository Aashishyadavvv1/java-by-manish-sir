//instance date member and isntance memeber function withh multiple objects

class Emp1{

String name;
int salary;

void get(String s1,int s2){
name=s1;
salary=s2;
}

void show(){
System.out.println("name "+name);
System.out.println("salary "+salary);
}

void main(){
Emp1 e1=new Emp1();
e1.get("ritik",15000);
e1.show();
Emp1 e2=new Emp1();
e2.get("aashish",15000);
e2.show();
}}