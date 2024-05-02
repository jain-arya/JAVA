class Test{
final int a = 10;
void show(){
a++;
System.out.println(a);
}
public static void main(String args[]){
Test t1 = new Test();
t1.show();
t1.show();
}
}
