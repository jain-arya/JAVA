class A{
A(){
System.out.println("Hello from A");
}
}

class B extends A{
B(){
System.out.println("Hello from B");
}
}

class Test{
public static void main(String args[]){
A a1 = new A();
B b1 = new B();
}
}
