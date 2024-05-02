class Test{
final int a;
Test (int x){
a=x;
}
void show(){
System.out.println(a);
}
public static void main(String args[]){
Test t1 = new Test(10);
Test t2 = new Test(20);
t1.show();
t2.show();
}
}

