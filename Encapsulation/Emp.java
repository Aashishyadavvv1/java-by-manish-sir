//instance date member and isntance memeber function

class Emp{

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
Emp e1=new Emp();
e1.get("ritik",15000);
e1.show();
}}