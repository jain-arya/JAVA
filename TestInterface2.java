interface First{
void show();
int a = 10;
}

interface Second{
int b = 20;
void display();
}

class A implements First,Second{
public void show(){
System.out.println("Hello Show");
}
public void display(){
System.out.println("hello Display");
}
void xyz(){
System.out.println(a);
System.out.println(b);
}
}

class Test{
public static void main(String args[]){
A a1 = new A();
a1.show();
a1.display();
a1.xyz();
}
}
