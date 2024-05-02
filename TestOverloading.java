class A{
void show(){
System.out.println("Hello A");
}
}

class B extends A{
void show(){
System.out.println("Hello B");
}
}

class C extends A{
void show(){
System.out.println("Hello C");
}
}

class Test{
public static void main(String args[]){
A a1 ;
B b1 = new B();
C c1 = new C();
a1 = b1;
a1.show();
b1.show();
a1 = c1;
a1.show();
c1.show();
}
}
