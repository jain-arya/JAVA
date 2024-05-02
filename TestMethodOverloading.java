class Test{
void add(){
System.out.println("Hello");
}
void add(int a , int b){
System.out.println(a+b);
}
void add(int a , int b , int c){
System.out.println(a+b+c);
}
void add(int a , int b , double c){
System.out.println(a+b+c);
}
public static void main(String args[]){
Test t1 = new Test();
t1.add();
t1.add(10,20);
t1.add(100,200,300);
t1.add(100,200,28.29);
}
}
