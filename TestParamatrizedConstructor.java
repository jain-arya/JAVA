class A{
A(int x , int y ){
System.out.println("Hello A"+" "+ x + " " + y);
}
}

class B extends A{
B(int a, int b, int c){
super(a,b);
System.out.println("Hello B"+" " + a + " " + b + " " + c);
}
}

class Test{
public static void main(String args[]){
A a1 = new A(10,20);
B b1 = new B(100,200,300);
}
}

