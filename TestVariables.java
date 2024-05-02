class Test
{
int a,b,c;
public static void main(String args[])
{
Test t1 = new Test();
Test t2 = new Test();
t1.a = 10;
t1.b = 20;
t1.c = 30;
t2.a = 100;
t2.b = 200;
t2.c = 300;
System.out.println(t1.a+" "+t1.b+" "+t1.c);
System.out.println(t2.a+" "+t2.b+" "+t2.c);
}
}