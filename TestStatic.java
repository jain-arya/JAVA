class Test{
static int a = 10;
public static void main(String args[]){
Test t1 = new Test();
Test t2 = new Test();
t1.a = 10;
System.out.println(t1.a);
t2.a = 100;
System.out.println(a);
System.out.println(Test.a);
}
}
