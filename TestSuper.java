class A{
int a =10;
}

class B extends A{
int a =20;
void show(){
int a=5;
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
}

class Test{
public static void main(String args[]){
B b1 = new B();
b1.show();
}
}
