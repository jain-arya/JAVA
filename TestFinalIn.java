class A{
final void show(){
System.out.println("Hello A");
}
}

class B extends A{
void show(){
System.out.println("Hello B");
}
}

class Test{
public static void main(String args[]){
A a1 = new A();
B b1 = new B();
a1.show();
b1.show();
}
}
